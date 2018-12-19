package com.java.JavaConcurrency;

import static com.java.JavaConcurrency.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_RED + " printing from Another thread class");
    }
}


