package com.java.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * This class for testing your changes.
 * it will contain main method.
 */
public class Runner {

    public static String EOF = "EOF";

    public static void main(String[] args) {

        // test on thread interfierence
//        {
//            Countdown countdown = new Countdown();
//
//            CountdownThread t1 = new CountdownThread(countdown);
//            t1.setName("Thread 1");
//            CountdownThread t2 = new CountdownThread(countdown);
//            t2.setName("Thread 2");
//
//            t1.start();
//            t2.start();
//        }
        // test two threads, one is writing another is reading
//        {
//            Messages messages = new Messages();
//            (new Thread(new Writer(messages))).start();
//            (new Thread(new Reader(messages))).start();
//        }

        // the java Util concurrent package

        List<String> buffer = new ArrayList<String>();
        Producer producer = new Producer(buffer, ThreadColors.ANSI_GREEN);

        Consumer consumer1 = new Consumer(buffer, ThreadColors.ANSI_BLUE);
        Consumer consumer2 = new Consumer(buffer, ThreadColors.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();



    }
}


