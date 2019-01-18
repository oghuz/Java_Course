package com.java.Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private Socket socket;
    public Echoer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            while (true){
                String echoString = input.readLine();
                System.out.println("Received Echo from Client : " + echoString);
                if (echoString.equals("quit")){
                    break;
                }
                writer.println(echoString);
            }

        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }finally {
            try {
                socket.close();
            }catch (IOException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
