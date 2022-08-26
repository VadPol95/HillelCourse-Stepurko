package com.hillel.Lesson_27;

public class DigitSum {
    public static void main(String[] args) {
        int value = 99892;
        System.out.println(calcDigit(value));

    }

    static int calcDigit(int value) {
        int val = summ(value);
        if (val >= 10) {
            val = calcDigit(val);
        }
        return val;
    }

    static int summ(int value){
        String[] sArr = String.valueOf(value).split("");
        value = 0;
        for (String s : sArr) {
            value += Integer.parseInt(s);
        }
        return value;
    }
}
