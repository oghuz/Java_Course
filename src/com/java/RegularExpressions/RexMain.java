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

        String newAlphaNumeric = "abcDeeefF123Ghg@ghkhk,JKo90898Y.incskjb";
        System.out.println(newAlphaNumeric.replaceAll("[^ef]", "O"));
        System.out.println(newAlphaNumeric.replaceAll("[a-g2-9]", " &&"));
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-g2-9]", " 66"));
        System.out.println(newAlphaNumeric.replaceAll("[0-9]", " 77"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", " 77")); // all digits
        System.out.println(newAlphaNumeric.replaceAll("\\D", " 222")); // all non digits

        System.out.println("==================================");
        String withSpaceAndTabs = " A String with space and\t and also a newLine\n";
        System.out.println(withSpaceAndTabs);
        System.out.println("==================================");
        System.out.println(withSpaceAndTabs.replaceAll("\\s", "SPACE"));
        System.out.println(withSpaceAndTabs.replaceAll("\\S", "SPACE"));
        System.out.println(withSpaceAndTabs.replaceAll("\\t", "TAB"));
       // System.out.println(withSpaceAndTabs.replaceAll("\\T", "TAB")); illegal operation
        System.out.println(withSpaceAndTabs.replaceAll("\\w", "WHITE"));
        System.out.println(withSpaceAndTabs.replaceAll("\\W", "WHITE"));
        System.out.println(withSpaceAndTabs.replaceAll("\\b", "^"));














    }
}

