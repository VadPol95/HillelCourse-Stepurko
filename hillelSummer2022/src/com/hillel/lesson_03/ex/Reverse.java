package com.hillel.lesson_03.ex;

import java.util.Arrays;
import java.util.Scanner;

// reverse number 111112344 - 443211111
public class Reverse {
    public static void main(String[] args) {
        String value;
        if (args.length == 0 ){
            value = new Scanner(System.in).next();
        } else {
            value = args[0];
        }

        char[] c = value.toCharArray();
        for (int i = 0; i < c.length/2; i++){
            char tmp = c[i];
            c[i] = c[c.length -1 - i];
            c[c.length -1 - i] = tmp;
        }

        String rez = "";
        for (char ch : c ){
            rez = rez + ch;
        }

        System.out.println(Integer.valueOf(rez));



    }
}
