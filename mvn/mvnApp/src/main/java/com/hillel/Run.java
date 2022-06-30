package com.hillel;

public class Run {
    public static void main(String[] args) {
       for (int i = 0; i < 10; i++){
           System.out.println(new Student().setId(i).setName("i").setAge(i));
       }
    }
}
