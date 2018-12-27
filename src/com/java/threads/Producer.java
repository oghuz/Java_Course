package com.java.threads;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
    //private ReentrantLock bufferLock;

    public Producer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;

    }

    @Override
    public void run() {
        Random random = new Random();
        String nums[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("producer was interrupted");
            }
        }
        System.out.println(color + "adding EOF and exiting...");

        try{
            buffer.put(Runner.EOF);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

