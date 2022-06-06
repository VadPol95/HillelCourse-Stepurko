package com.hillel.lesson_06.task;

public class LuckyNumbers {
    /*
    Оределить есть ли номерок счастливым????
     */
    public boolean calculateLuckyNumber(String value){
        if (value.length() % 2 != 0){
            return false;
        }
        String[] str = value.split("");

        int left = 0;
        int right = 0;

        for (int i =0; i < str.length/2; i++){
            left += Integer.parseInt(str[i]); // 0 1 2
            right += Integer.parseInt(str[str.length/2 + i ]); // 5 4 3
        }
        return left == right;
    }
}

class Run{
    public static void main(String[] args) {
        String number = "123420";
        System.out.println(new LuckyNumbers().calculateLuckyNumber(number));
    }
}
