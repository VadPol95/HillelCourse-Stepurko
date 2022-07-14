package com.blackJack.service;

import com.blackJack.dto.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

class CardDeckTest {

    @Test
    public void createDeckTest(){
        CardDeck cd = new CardDeck();
        List<Card> list = cd.createDeck();
        Assertions.assertEquals(52, list.size());
        list.forEach(c -> System.out.print(c + " "));
    }

    @Test
    @RepeatedTest(50)
    public void shuffleDeckTest(){
        CardDeck cd = new CardDeck();
        List<Card> list = cd.createDeck();
        List<Card> sList = cd.shuffleCard(cd.createDeck());
        Assertions.assertFalse(list.equals(sList));

    }

    @Test
    public void voidShuffleDeckTest(){
        CardDeck cd = new CardDeck();
        List<Card> list = cd.createDeck();
        list.forEach(c -> System.out.print(c + " "));
        cd.voidShuffleCard(list);
        System.out.println();
        System.out.println("---------");
        list.forEach(c -> System.out.print(c + " "));
    }

}