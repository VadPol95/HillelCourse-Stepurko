package com.blackJack.service;

import com.blackJack.dto.Card;
import com.blackJack.dto.Rank;
import com.blackJack.dto.Suit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;


class CardServiceTest {
    @Test
    void voidGetGardTest(){
        CardDeck cd = new CardDeck();
        List<Card> cards = cd.createDeck();
        Card cardTest = new Card(Rank.Two, Suit.Hearts);
        CardService cs = new CardService();
        Card card = cs.getCard(cards);

        Assertions.assertNotNull(card);
        Assertions.assertEquals(51, cards.size());
        System.out.println(card);
        Assertions.assertEquals(cardTest, card);
    }

    @Test
    @RepeatedTest(100)
    void computerTurn() {
        CardService cs = new CardService();
        int value = cs.computerTurn();
        System.out.println(value);
        Assertions.assertTrue(value >=17 && value <=25);
    }

    @Test
    void calculatePlayerCount() {
    }
}