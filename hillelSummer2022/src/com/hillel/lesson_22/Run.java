package com.hillel.lesson_22;

import java.lang.reflect.Field;

public class Run {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        ImmClazz ic = new ImmClazz(1, "str");
//
//        Field fStr = ic.getClass().getDeclaredField("str");
//        fStr.setAccessible(true);
//        fStr.set(ic, "xxxx");
//
//        Field fId = ic.getClass().getDeclaredField("id");
//        fId.setAccessible(true);
//        fId.set(ic, 2);
//
//        System.out.println(ic);

        String str = "text";

        Class fn = str.getClass();
        Field field = fn.getDeclaredField("value");
        field.setAccessible(true);
        field.set(str, "WTF".getBytes());
        System.out.println(field.get(str));

    }
}
