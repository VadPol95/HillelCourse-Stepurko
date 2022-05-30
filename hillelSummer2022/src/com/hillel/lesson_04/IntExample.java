package com.hillel.lesson_04;

public class IntExample {
    public static void main(String[] args) {

        Integer a1 = 10;
        Integer a2 = 20;

        System.out.println(a1 + a2);

        printA(a1); // object

        int b =34;
        printI(a1); // prim
        System.out.println(a1);

//        Integer i1 = 127; // int pool
//        Integer i2 = 127; // int pool ---> 127
//        Integer i3 = i1;  // int poll
//
//        System.out.println(i1 == i2);
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
//        i1 = 5;
//
//        System.out.println(i1);
//        System.out.println(i1 == i2);
//        System.out.println(i2);
//        System.out.println(i3);
//
//
//        i1 = Integer.valueOf(2000);
//        i2 = Integer.valueOf(2000);
//        i3 = i1;
//
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
//
//        i1 = 300;
//
//        System.out.println(i1);
//        System.out.println(i2);
//        System.out.println(i3);
    }

    static void  printA (int a){
        System.out.println(a);
    }

    static void printI (Integer a){
        a = 15;
        System.out.println(a);
    }
}
