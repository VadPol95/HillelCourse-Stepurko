package com.hillel.lesson_08.set;

import java.util.HashSet;
import java.util.Set;

public class HSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(5);

        System.out.println(set.add("1zxcvzxc"));
        System.out.println(set.add("1")); // false
        System.out.println(set.add("2xzcvzxcv"));
        System.out.println(set.add("3wqeqwr"));
        System.out.println(set.add("4qweqwe"));
        System.out.println(set.add("5qweqwe"));
        System.out.println(set.add("6qweqwe"));
        System.out.println(set.add("7"));
        System.out.println(set.add("8v xcbxc"));

        System.out.println(set);



        int i = 1;
        int count = 0;
        String value = null;
        for (String s : set){
            if (count++ == i) value = s;
         }

        System.out.println(value);

    }
}
