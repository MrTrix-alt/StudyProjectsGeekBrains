package ru.homework.lessonSix.HW;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientConsoleChat extends JFrame {
    private Scanner scanner;
    private Scanner inPut;
    private PrintWriter printWriter;
    private Thread threadIn;
    private Thread threadOut;

    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8080;
    private static final String END_MESSAGE = "/end";

    private DataInputStream in;
    private DataOutputStream out;
    private Socket socket;

    private JTextField msgInputField;
    private JTextArea chatArea;


    public ClientConsoleChat (Socket socket, String serviceName) throws IOException {

        try {
            scanner = new Scanner(socket.getInputStream());
            inPut = new Scanner(System.in);
            printWriter = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.socket = new Socket(SERVER_ADDR, SERVER_PORT);
        in = new DataInputStream(this.socket.getInputStream());
        out = new DataOutputStream(this.socket.getOutputStream());

        new Thread(() -> {
            System.out.println("Processing connection. Thread: " + Thread.currentThread().getName());
            try {
                while (true) {
                    String strFromServer = in.readUTF();
                    if (strFromServer.equalsIgnoreCase(END_MESSAGE)) {
                        break;
                    }
                    chatArea.append(strFromServer);
                    chatArea.append("\n");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Connection is not available",
                        "Error", JOptionPane.ERROR_MESSAGE);
                // e.printStackTrace();
            }
        }).start();

        threadOut = new Thread(() -> {
            while (true) {
                if (inPut.hasNext()) {
                    String msg = inPut.next();
                    sendMessage(serviceName + ": " + msg);
                    if (msg.equals("end"))
                        break;
                }
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
        threadOut.start();

        threadIn = new Thread(() -> {
            while (true) {
                if (scanner.hasNext()) {
                    String writer = scanner.nextLine();
                    System.out.println(writer);
                    if (writer.equals("end"))
                        break;
                }
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        threadIn.start();

        try {
            System.out.println("Open connection. Thread: " + Thread.currentThread().getName());
            openConnection();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connection with server. " + e.getMessage(),
                    "Error!", JOptionPane.ERROR_MESSAGE);
        }
        prepareGUI();
    }

    public void openConnection() throws IOException {

    }

    private void close(Closeable... objects) {
        for (Closeable o : objects) {
            try {
                if (o != null) {
                    o.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void sendMessage() {
        if (!msgInputField.getText().trim().isEmpty()) {
            if (socket.isClosed() || out == null) {
                JOptionPane.showMessageDialog(null, "Error sending message. Server is not available. ",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String text = msgInputField.getText();

            try {
                out.writeUTF(text);
                out.flush();
                msgInputField.setText("");
                msgInputField.grabFocus();

                if (END_MESSAGE.equals(text)) {
                    close(in, out, socket);
                }
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error sending message. " + e.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void prepareGUI() {
        // Параметры окна
        setBounds(600, 300, 500, 500);
        setTitle("Client");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Текстовое поле для вывода сообщений
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);

        // Нижняя панель с полем для ввода сообщений и кнопкой отправки сообщений
        JPanel bottomPanel = new JPanel(new BorderLayout());
        JButton btnSendMsg = new JButton("Send");
        bottomPanel.add(btnSendMsg, BorderLayout.EAST);
        msgInputField = new JTextField();
        add(bottomPanel, BorderLayout.SOUTH);
        bottomPanel.add(msgInputField, BorderLayout.CENTER);
        // lambda expressions
        btnSendMsg.addActionListener(e -> sendMessage());
        msgInputField.addActionListener(e -> sendMessage());

        // Настраиваем действие на закрытие окна
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                try {
                    if (out != null) {
                        out.writeUTF(END_MESSAGE);
                    }
                } catch (IOException exc) {
                    exc.printStackTrace();
                } finally {
                    close(in, out, socket);
                }
            }
        });

        setVisible(true);
    }

    private void sendMessage(String msg) {
        printWriter.println(msg);
        printWriter.flush();
    }

}