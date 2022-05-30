package com.hillel.lesson_04.ex;

import java.util.Locale;

public class Polindrom {

    private static final String TEXT = "А роза упала на лапу Азора";
    private static final String TEXT_F = "afrefa";

    public static void main(String[] args) {
        System.out.println(isPolindrom(TEXT));
        System.out.println(isPolindrom(TEXT_F));
        System.out.println(isPolindromSB(TEXT));
        System.out.println(isPolindromSB(TEXT_F));
    }

    public static boolean isPolindrom(String str) {
        String s = str
                .toLowerCase(Locale.ROOT)
                .replace(" ", "");
        System.out.println(s);
        String[] sArray = s.split("");
        for (int i = 0; i < s.length() / 2; i++){
            if (!sArray[i].equals(sArray[s.length() - i - 1])){
                return false;
            }
        }
        return true;
    }

    public static boolean isPolindromSB(String str) {
        return str.replace(" ", "")
                .equalsIgnoreCase(new StringBuilder(str.replace(" ", "")).reverse().toString());
    }
}
