package com.hillel.lesson_10;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();

        System.out.println(list.add("one"));
        System.out.println(list.add("two"));
        System.out.println(list.add("one")); // false
        System.out.println(list.add("four"));
        System.out.println(list.add("five"));

        System.out.println(list);

        System.out.println("---------");

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

        System.out.println(set.add("one"));
        System.out.println(set.add("one"));

        System.out.println(set);

        for (String s : set){
            System.out.println(s);
        }

        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());


    }
}
