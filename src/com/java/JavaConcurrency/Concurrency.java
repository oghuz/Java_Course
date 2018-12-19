package com.java.JavaConcurrency;

// Basics of Java concurrency 

class ConcurrencyJava{
    public static void main(String[] args) {
        AnotherThread aThread = new AnotherThread();
        aThread.start();
    }
}
