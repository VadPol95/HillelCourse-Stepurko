package com.hillel.lesson_20.ex;

import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        var list = List.of(
                new String[]{"A", "BB", "CCC"},
                new String[]{"DD", "E"}
        );
        list.forEach(x ->
                System.out.print(x.length));
    }
}