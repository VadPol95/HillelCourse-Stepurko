package com.hillel.lesson_03.ex;

import java.util.Scanner;

// count summ of odd numbers 12235 - 1 + 3 + 5 = 9
public class ChetNumber {

    public static void main(String[] args) {
        String value;
        if (args.length == 0 ){
            value = new Scanner(System.in).next();
        } else {
            value = args[0];
        }
        String[] c = value.split("");
        int result = 0;
        for (String s : c) {
            if (Double.parseDouble(s) % 2 != 0) { // Integer.parseInt(s) --> Integer
                result += Double.parseDouble(s);
            }
        }
        System.out.println(result);
    }

}
