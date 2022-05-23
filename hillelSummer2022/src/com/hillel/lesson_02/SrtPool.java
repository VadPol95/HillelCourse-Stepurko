package com.hillel.lesson_02;

public class SrtPool {
    public static void main(String[] args) {
        String str1 = "cat"; // stringPool
        String str2 = "cat"; // stringPool
        String str3 = new String("cat"); // heap

//        str3 = str3.toLowerCase().intern();
       str3 = str3.intern();

        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str3); // false
        System.out.println(str1.equals(str3)); // true


    }
}
