package com.hillel.lesson_03;

public class IfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;

//        if (a == b) { // 1
//            System.out.println("a = b"); //true
//        }
//        if (a < b){ // 2
//            System.out.println("a < b"); //true
//        }
//        if (a > b){ // 3
//            System.out.println("a > b"); //true
//        }
//
//        if (true) {
//            // statement 1 if true
//        } else {
//            // statement 2 if false
//        }

//        if (a < b) {
//            System.out.println("a < b");
//        } else if (a == b) {
//            System.out.println("a = b");
//        } else if (a > b) {
//            System.out.println("a > b");
//        } else {
//            System.out.println(true);
//        }
//
        // ternary operation
//        System.out.println(compare(a, b) ? 1 : 0);
//        System.out.println(compare(b, a) ? 1 : 0);
//
//        System.out.println(a < b ? 1 : 0);
//        System.out.println(a > b ? 1 : 0);
//
//        System.out.println(a > b ? print1() : print2());

//        System.out.println(a < b || a > b ? a < b ? 1 : 0 : print2());
//        if (true) {
//            if (true) {
//            }
//            // statement 1
//        } else {
//            // statement 2
//        }

        if (false) {
            System.out.println("line1");
            System.out.println("line2");
            System.out.println("line3");
        }
    }

    static boolean compare(int a, int b) {
        return a < b;
    }

    static String print1(){
        System.out.println("print1");
        return "1";
    }
    static String print2(){
        System.out.println("print2");
        return "2";
    }
}
