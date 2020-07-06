package ru.homework.lessonSix.HW;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleServerChat  {
    private final int SERVER_PORT = 8080;
    private ServerSocket server;
    private Socket socket;

    public ConsoleServerChat () {

        try {
            server = new ServerSocket(SERVER_PORT);
            System.out.println("Server started, waiting connection...");
            socket = server.accept();
            System.out.println("Client connected");
            new ClientConsoleChat(socket, "Server");
            while(true){
                if(socket.isClosed()){
                    break;
                }
            }
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ConsoleServerChat();
    }
}
