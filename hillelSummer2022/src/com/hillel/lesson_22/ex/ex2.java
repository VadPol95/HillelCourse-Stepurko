package com.hillel.lesson_22.ex;

import com.hillel.lesson_04.ex.Run;
import com.hillel.lesson_12.exception.Thr;

public class ex2 {
    public static void main(String[] args) {
        try {
            foo();
        } catch (RuntimeException ex) {
            System.out.println("exMain");
            ex.printStackTrace();
        }
    }

    public static void foo() {
        try {
            throw new IllegalArgumentException("catch");
        } finally {
            try {
                throw new RuntimeException("finally");
            } catch (RuntimeException ex) {
                System.out.println("exFoo");
                ex.printStackTrace();
            }
        }
    }
}
