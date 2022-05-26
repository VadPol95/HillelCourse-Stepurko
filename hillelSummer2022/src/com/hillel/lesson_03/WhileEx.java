package com.hillel.lesson_03;


public class WhileEx {
    public static void main(String[] args) {

//        whileExample();
        doWhileExample();
    }

    static void whileExample(){
        byte a = 101;
        byte result = 0;
        while (a <= 100) { // 101 > 100
//            result += a--;
//            System.out.println("a > " + a + ", result > " + result);
            System.out.println(a++);
        }
        System.out.println("-------");
        System.out.println(a);
        System.out.println(result);
    }

    static void doWhileExample(){
        byte a = 125;
        byte result = 0;
        do {
            System.out.println(a++);
        }while (a < 100);
        System.out.println("----------");
        System.out.println(a);
        System.out.println(result);
    }
}
