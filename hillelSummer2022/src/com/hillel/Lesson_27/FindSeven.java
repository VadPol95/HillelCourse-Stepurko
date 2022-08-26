package com.hillel.Lesson_27;

import java.util.Arrays;

public class FindSeven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8 ,43};

        String str = Arrays.toString(arr);
        System.out.println(str);

        if (str.contains("7")) {
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        };


        }

    }

