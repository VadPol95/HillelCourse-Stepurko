package com.hillel.lesson_14.task;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChangeWordPlace {
    //5. В каждом предложении текста поменять местами первое слово с последним, не изменяя
    //длины предложения.

    private static String EX = "1 2 3. 2 3 4. 3 4 5. 6 7";
    private static String REZ = "3 2 1. 4 3 2. 5 4 3. 7 6";

    public static void main(String[] args) {
        changeWordOrder(EX);
    }

    private static void changeWordOrder(String text) {
        String collect =
                Arrays.stream(EX.split("\\. "))
                        .map(ChangeWordPlace::swap)
                        .collect(Collectors.joining(". "));
        System.out.println(collect);
    }

    private static String swap(String str){
        String[] arr = str.split(" ");
        String tmp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;

        return String.join(" ", arr);
    }
}
