package com.hillel.lesson_13.task;


import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

// Из текста удалить все слова заданной длины,
// начинающиеся c заданой буквы.
public class RemoveFromText {

    private final static String TEXT = "Скажите зачем эта маленькая княгиня сказал князь Василий " +
            "тихо Анне Павловне почему он особенно умного Мы после поговорим сказала Анна Павловна" +
            " улыбаясь";

    public static void main(String[] args) {
        int len = 4;
        String c = "а";
        List<String> stringList = Arrays.stream(TEXT.split(" "))
                .map(s -> s.toLowerCase(Locale.ROOT))
                .filter(s -> s.length() == len)
                .filter(s -> s.startsWith(c))
                .collect(Collectors.toList());

        stringList.forEach(s -> System.out.print(s + " "));


    }


}
