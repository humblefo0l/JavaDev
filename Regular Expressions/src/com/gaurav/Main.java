package com.gaurav;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12GsfgsgIIGij 99z";
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY"));

        String secondString = "abcDeerF12abcDeeGsfgsgIIGJ99z";
        System.out.println(secondString.replaceAll("^abcDee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDee"));
        System.out.println(alphanumeric.matches("abcDeerF12GsfgsgIIGJ99z"));

        System.out.println(alphanumeric.replaceAll("IGJ99z$", "The End"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "-i replaced a letter here-"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[hH]arry", "Harry"));

        String newAlphanumeric = "abcDeeeF12GsfgJejsgIIGijkl99z";
        System.out.println(newAlphanumeric.replaceAll( "[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-i3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[a-iA-I3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-i3-8]", "X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphanumeric.replaceAll("\\D", "X"));

        String hasWhiteSpace = "I have a blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s", ""));
        System.out.println(hasWhiteSpace.replaceAll("\t", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S", ""));
        System.out.println(newAlphanumeric.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\W", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b", "X"));
        System.out.println(hasWhiteSpace.replaceAll("\\B", "X"));
    }
}
