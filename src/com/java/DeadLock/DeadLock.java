package com.java.DeadLock;

public class DeadLock {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    // they can't be depandent on each other at the same time, it'll cause Thread deadlock, meaning thet will be blocked

    public static void main(String[] args) {

    }
}
