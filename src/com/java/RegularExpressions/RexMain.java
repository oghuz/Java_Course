package com.java.RegularExpressions;

public class RexMain {
    public static void main(String[] args) {
        String string = "I am a string, yes I am";
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);
        String alphaNumeric = "abcDeeefF123Ghg@ghkhk,JKo90898Y.incskjb";

        System.out.println(alphaNumeric.replaceAll("^abcD", "Ttt"));
        System.out.println(alphaNumeric.replaceAll("jb$", "ended"));
        System.out.println(alphaNumeric.replaceAll("[k]", "QQQQ"));
        System.out.println(alphaNumeric.replaceAll("[ee]", " I replaced an ee here"));
        System.out.println(alphaNumeric.replaceAll("[k][h]", " I replaced k here followed by h"));



    }
}

