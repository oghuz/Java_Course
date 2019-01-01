package com.java.RegularExpressions;

public class RexMain {
    public static void main(String[] args) {
        String string = "I am a string, yes I am";
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

    }
}

