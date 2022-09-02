package com.hillel.lesson_29.ex;

public class Test2 {
    public static void main(String[] args) {
        Test2 test = new Test2();
        test.print("C");

        print();

    }

    public static void print() {
        System.out.println("A");
    }

    public  void print(String s) {
        System.out.println("B");
    }
}
