package com.hillel.lesson_22.hw.bl.impl;

import com.hillel.lesson_22.hw.bl.StudentService;
import com.hillel.lesson_22.hw.db.DataService;

public class StudentServiceimpl implements StudentService {
    @Override
    public int createStudent() {
        DataService ds = new DataService();
        ds.createUser();
        return 0;
    }

    @Override
    public void deleteStudent() {

    }
}
