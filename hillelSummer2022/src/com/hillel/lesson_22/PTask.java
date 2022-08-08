package com.hillel.lesson_22;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.SQLException;

/*
     * Write a java program to get by the method any annotations.
     * You can check if any annotations is exist just checking the size of an array (Annotation[].size).
     * @param method - current method of class.
     * @param clazz - clazz should be scan.
     *  isMethodHasAnnotation(Method method, Class<?> clazz);
     */
public class PTask {
       public boolean isMethodHasAnnotation(Method method, Class<?> clazz) {
           Method[] methods = clazz.getMethods();
           for (Method m : methods ) {
               if (m.getName().equals(method.getName())) {
                   Annotation[] annotations = method.getAnnotations();
                   return annotations.length > 0;
               }
           }
           throw new RuntimeException();
       }

    public static void main(String[] args) throws NoSuchMethodException {
        PTask pt = new PTask();

        Class foo = Foo.class;
        Method methodFoo = foo.getMethod("t");

        Class boo = Boo.class;
        Method methodBoo = boo.getMethod("print");

        System.out.println(pt.isMethodHasAnnotation(methodBoo, Boo.class));
    }


}
class Boo {
    @Deprecated
    public String print() {
        return "null";
    }

    public void test(){}
}

class Foo {
    public void t(){}
}