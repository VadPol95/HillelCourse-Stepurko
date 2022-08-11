package com.blackJack.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class ComputerTurnTest {

    @Test
    @RepeatedTest(100)
    void getComputerScore(){
        int result = new ComputerTurn().getComputerScore();
        System.out.println(result);
        Assertions.assertTrue(result >= 17);
        Assertions.assertTrue(result <= 23);
    }

}