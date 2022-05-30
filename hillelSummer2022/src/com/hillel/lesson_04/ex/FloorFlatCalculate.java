package com.hillel.lesson_04.ex;

/*
В N этажного жилом доме M квартир.
Определить, на каком этаже и в каком подъезде
находится квартира с заданным номером.
 4 квартиры на этаже
 */
// 9 этажей 108 квартир
public class FloorFlatCalculate {
    public static void main(String[] args) {
        int flour = 9;
        int pod = 36;
        int flatCount = 108;
        int flatNumber = 100;

        System.out.println("pod > " + (flatNumber / 36 + 1) );
        System.out.println(100 % 36 / 4);
    }
}
