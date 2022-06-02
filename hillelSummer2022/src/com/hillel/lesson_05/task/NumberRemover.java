package com.hillel.lesson_05.task;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива
//(пропусков быть не должно). 1 2 3 4 5 6 4 5 4 - (4) -> 1 2 3 5 6 5
public class NumberRemover {
    public static void main(String[] args) {
        int remValue = 4;
        int[] mass = {4,1,2,3,4,5,4,6,3,6,4,4,4,9,0};

        int count = 0;
        for (int j : mass) {
            if (j != remValue) count++;
        }
        int[] mass2 = new int[count];
        int number = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] != remValue) {
                mass2[number++] = mass[i];
            }
        }
        System.out.println(Arrays.toString(mass2));

        }

    }
