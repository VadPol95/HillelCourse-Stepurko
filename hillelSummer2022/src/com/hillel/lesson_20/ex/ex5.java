package com.hillel.lesson_20.ex;

class Car {
    void speed(Byte val) {
        System.out.println("DARK");
    }

    void speed(byte... vals) {
        System.out.println("LIGHT");
    }

}

public class ex5 {

    public static void main(String... args) {
        byte[] b = {10};
//        byte b = 10;
        new Car().speed(b);
    }
}
