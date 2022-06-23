package com.hillel.lesson_11;

import com.hillel.lesson_04.Stud;

public class StudentRun {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(1).setAge(1);
        st.setName("Alex");
//        st.setAge(40);

        Student st2 = new Student()
                .setId(1)
                .setName("Ivan")
                .setAge(16);

        System.out.println(st);
        System.out.println(st2);
    }
}
