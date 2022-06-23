package com.hillel.lesson_11.java14;

public class StringF {

    private static final String SQL = "select * form table where id = %s and name = %s";

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
        System.out.println(String.format(SQL, i, "Ivan_" + i));


    }
}
