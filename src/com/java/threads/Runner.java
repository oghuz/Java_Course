package com.java.threads;

/**
 * This class for testing your changes.
 * it will contain main method.
 */
public class Runner {


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
        {
            Messages messages = new Messages();
            (new Thread(new Writer(messages))).start();
            (new Thread(new Reader(messages))).start();
        }
    }
}


