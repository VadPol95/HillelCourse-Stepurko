package com.hillel.lesson_23.hw;

import com.hillel.lesson_23.hw.service.BService;
import com.hillel.lesson_23.hw.service.impl.BussinesServiceImpl;

public class Run {
    public static void main(String[] args) {
        BService bs = new BussinesServiceImpl();
        bs.getDataFromSource();

    }
}
