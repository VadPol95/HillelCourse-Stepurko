package com.blackJack.service;

public class ComputerTurn {
    public int getComputerScore(){
        return (int) ((Math.random() * (23 - 17)) + 17);
    }
}
