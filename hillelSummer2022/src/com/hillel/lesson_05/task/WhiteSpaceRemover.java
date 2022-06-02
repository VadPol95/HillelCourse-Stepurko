package com.hillel.lesson_05.task;

public class WhiteSpaceRemover {
    // Напишите Java-программу для удаления всех пробелов из строки без использования replace().
    public static void main(String[] args) {
        String str = " Hello World Напишите Java-программу для удаления всех пробелов из строки без использования replace().";
        // 1. replace
        String s1 = str;
        System.out.println(s1.replace(" ",  ""));

        // 2. without replace
        String[] s = str.split(" ");
        str = "";
        for (String st : s) {
            str = str.concat(st);
        }
        System.out.println(str);
    }
}
