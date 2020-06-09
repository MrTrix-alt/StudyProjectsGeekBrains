package ru.chat.network;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;


public class TCPConnection { // основной класс соединения

    private final Socket socket;
    private final Thread rxThread;
    private final TCPConnectionListener eventListener; // слушатель событий, который обрабатывает их с помощью
                                                       // методов, объявленных в интерфейсе TCPConnection
    private final BufferedReader in;
    private final BufferedWriter out;

    public TCPConnection(TCPConnectionListener eventListener, String ipAddr, int port) throws IOException {
        this(eventListener, new Socket(ipAddr, port));

    }

    public TCPConnection(TCPConnectionListener eventListener,Socket socket) throws IOException { // принимает объект Socket и будет создавать соединение с этим объектом
        this.eventListener = eventListener;
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("UTF-8"))); // генерирует IOException
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), Charset.forName("UTF-8")));
        rxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    eventListener.onConnectionReady(TCPConnection.this); // принимает объект класс TCPConnection
                    while (!rxThread.isInterrupted()) {
                        eventListener.onReceiveString(TCPConnection.this, in.readLine());
                    }

                } catch (IOException e) {
                    eventListener.onException(TCPConnection.this, e);
                } finally {
                    eventListener.onDisconnect(TCPConnection.this);

                }
                }
        });
        rxThread.start();

    }

    public synchronized void submitString(String value) {
        try {
            out.write(value + "\r\n"); // генерирует IOException
            out.flush(); // сбрасывает все буферы и отправляет
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
            disconnect(); // остановит поток, закрывая socket
        }
    }

    public synchronized void disconnect() {
        rxThread.interrupt();
        try {
            socket.close(); // вызывает IOException
        } catch (IOException e) {
            eventListener.onException(TCPConnection.this, e);
        }
    }

    @Override
    public String toString() { // переопределяем метод toString()
        return "TCPConnection: " + socket.getInetAddress() + ": " + socket.getPort();
    }


}
