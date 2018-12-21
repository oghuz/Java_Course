package com.java.threads;

import com.java.JavaConcurrency.ThreadColor;

class Countdown {

    private double i;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_GREEN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_RED;
                break;
            default:
                color = ThreadColor.ANSI_BLUE;
        }

        synchronized (this){
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
