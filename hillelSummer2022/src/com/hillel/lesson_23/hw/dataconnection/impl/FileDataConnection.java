package com.hillel.lesson_23.hw.dataconnection.impl;

import com.hillel.lesson_23.hw.dataconnection.DataConnection;

public class FileDataConnection implements DataConnection {


    @Override
    public void print(String str) {
        System.out.println("get data from file");
    }
}
