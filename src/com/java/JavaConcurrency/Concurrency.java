package com.java.JavaConcurrency;

// Basics of Java concurrency 

class ConcurrencyJava extends Thread{
    public static void main(String[] args) {
        AnotherThread aThread = new AnotherThread();
        aThread.start();
    }

    
    
}