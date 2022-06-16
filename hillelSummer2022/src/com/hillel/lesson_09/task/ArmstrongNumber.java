package com.hillel.lesson_09.task;

/*
    Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
    Прежде всего, нам нужно понять, что такое число Армстронга.
    Число Армстронга это число, значение которого равно сумме цифр,
    из которых оно состоит, возведенных в степень, равную количеству
    цифр в этом числе.

    Как пример - число 371:
    371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
    Если у вас число четырехзначное:
    8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 820812.

    вывести первые N чисел
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int value = 371;

        int numbers = 20;
        int counter = 0;
        int cNumber = 0;
//        for (int i = 0; counter <= numbers; i++) {
//
//            if (isArmstrNumber(i)) {
//                counter++;
//                System.out.println("destination between :" + cNumber);
//                cNumber = 0;
//            } else {
//                cNumber++;
//            }
//        }

    }

    public static boolean isArmstrNumber(Integer value) {
        String[] strArray = value.toString().split("");
        int pow = strArray.length;

        int result = 0;

        for (String s : strArray) {
            result += Math.pow(Integer.parseInt(s), pow);
        }
        if (value == result) {
            System.out.println(value + " : is Armstrong number");
        }

        return value == result;
    }
}
