package com.java.Networking;

import java.io.IOException;
import java.net.ServerSocket;



public class EchoServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            while (true) {
                //new Echoer(serverSocket.accept()).start();
                serverSocket.accept();
            }
        } catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
