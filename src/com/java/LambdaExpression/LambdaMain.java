package com.java.LambdaExpression;

public class LambdaMain {


    public static void main(String[] args) {
        new Thread(()->System.out.println("Printing from Lambda Expression")).start();
    }
}
