package com.java.threads;


import com.java.JavaConcurrency.ThreadColor;

import java.util.concurrent.*;

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

//        List<String> buffer = new ArrayList<>();
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

       // ReentrantLock bufferLock = new ReentrantLock();
        // don't need buffer lock when using ArrayBlockingQueue
        ExecutorService executeService = Executors.newFixedThreadPool(3);

        Producer producer = new Producer(buffer, ThreadColors.ANSI_GREEN);

        Consumer consumer1 = new Consumer(buffer, ThreadColors.ANSI_BLUE);
        Consumer consumer2 = new Consumer(buffer, ThreadColors.ANSI_CYAN);

        executeService.execute(producer);
        executeService.execute(consumer1);
        executeService.execute(consumer2);

        Future<String> feature = executeService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_GREEN + " being printed for the callable class");
                return " This is the callable result";
            }
        });

        try {
            System.out.println(feature.get());
        }catch (ExecutionException e ) {
            System.out.println("something is wrong :" + e.getMessage());
        }catch (InterruptedException e){
            System.out.println("process was interrupted : " + e.getMessage());
        }

        executeService.shutdown();

    }
}


