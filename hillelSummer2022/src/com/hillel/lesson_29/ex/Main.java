package com.hillel.lesson_29.ex;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("q", "a");
        System.out.println(map);

        map.put("q", "b");
        System.out.println(map);
    }
}
