package ru.homework.lessonSix.HW;

import javax.swing.*;
import java.io.IOException;
import java.net.Socket;

public class EchoClient {

    private final String SERVER_ADDR = "localhost";
    private final int SERVER_PORT = 8080;

    public EchoClient() {

        try {
            Socket sock = new Socket(SERVER_ADDR, SERVER_PORT);
            new ClientConsoleChat(sock, "Client");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println("In main. Thread: " + Thread.currentThread().getName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("Create client. Thread: " + Thread.currentThread().getName());
                new EchoClient();
            }
        });
    }
}
