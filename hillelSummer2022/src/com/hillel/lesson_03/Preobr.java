package com.hillel.lesson_03;

public class Preobr {
    public static void main(String[] args) {

        Calculate c  = new Calculate();
        String str = "aaa";
        System.out.println(Integer.valueOf(str));

//        byte b = 10;
//        short s = 10;
//        long l = 10L;
//        long ll = 3_000_000_000L;
//        c.calc(b); // byte -> int
//        c.calc(s); // short -> int
//        c.calc((int) l); // long -> int
//        c.calc((int) ll); // long -> int
    }

}

class Calculate {
    public void calc(int a){
        System.out.println(a*a);
    }
}