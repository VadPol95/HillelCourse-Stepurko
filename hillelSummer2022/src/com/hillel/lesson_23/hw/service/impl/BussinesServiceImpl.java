package com.hillel.lesson_23.hw.service.impl;

import com.hillel.lesson_23.hw.dataconnection.DataConnection;
import com.hillel.lesson_23.hw.dataconnection.impl.DbDataConnection;
import com.hillel.lesson_23.hw.dataconnection.impl.FileDataConnection;
import com.hillel.lesson_23.hw.service.BService;

public class BussinesServiceImpl implements BService {

//    private DataConnection dc = new DbDataConnection();
    private DataConnection dc = new FileDataConnection();
    @Override
    public void getDataFromSource() {
        dc.print("str");
    }
}
