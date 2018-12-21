package com.java.threads;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
    private List<String> buffer;
    private String color;

    public Producer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String nums[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String num: nums){
            try {
                System.out.println(color + "Adding..." + num);
                synchronized (buffer){
                    buffer.add(num);
                }

                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println("producer was interrupted");
            }
        }
        System.out.println(color + "adding EOF and exiting...");
        synchronized (buffer){
            buffer.add(Runner.EOF);
        }
    }
}

