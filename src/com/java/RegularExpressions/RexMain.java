package com.java.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        System.out.println("========= Quantified ==========");
        String thirdAlphaNumerics = "abcDeeefF123Ghg@ghkhk,JKo9abcD0898Y.incskjb";
        System.out.println(thirdAlphaNumerics.replaceAll("^abc+", "###"));
        System.out.println(thirdAlphaNumerics.replaceAll("^abcDe{3}", "###"));
        System.out.println(thirdAlphaNumerics.replaceAll("^abcDe*", "###"));
        System.out.println(thirdAlphaNumerics.replaceAll("^abcDe{2,4}", "###"));

        System.out.println("========= Quantified 2 ==========");
        System.out.println(thirdAlphaNumerics.replaceAll("e+f*F", "^^^"));

        StringBuilder htmlText = new StringBuilder("<h1> My Header </h1>");
        htmlText.append("<h2> Second Header </h2>");
        htmlText.append("<p> This is a paragraph I appended. </p>");
        htmlText.append("<p> another paragraph appended to html text </p>");
        htmlText.append("<h2> Summary </h2>");
        htmlText.append("<p> Here is the summary </p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern pattern2 = Pattern.compile(h2GroupPattern);
        Matcher matcher2 = pattern2.matcher(htmlText);
        System.out.println(matcher2.matches());

        matcher2.reset();
        while(matcher2.find()) {
            System.out.println("Occurence " + matcher2.group(1));
        }

        String h2TextGroup = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);
        while (h2TextMatcher.find()) {
            System.out.println("Occurence " + h2TextMatcher.group(2));
        }





















    }
}

