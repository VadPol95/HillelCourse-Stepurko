package com.blackJack.service;

import com.blackJack.dto.Card;
import com.blackJack.dto.Rank;
import com.blackJack.dto.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CardDeck {

    private List<Card> createCardDeck(){
        List<Card> cards = new ArrayList<>(52);

        for (Rank r : Rank.values()){
            for (Suit s : Suit.values()){
                cards.add(new Card(r, s));
            }
        }
        return cards;
    }

    private List<Card> shuffleDeck(List<Card> deck){
      ArrayList<Card> cards = new ArrayList<>();
      while (deck.size() > 0){
          int index = (int) (Math.random() * deck.size());
          cards.add(deck.get(index));
          deck.remove(index);
      }
      return cards;
    }

    public List<Card> getNewDeck(){
//        return shuffleDeck(createCardDeck());
        List<Card> cardDeck = createCardDeck();
        Collections.shuffle(cardDeck);
        return cardDeck;
    }

    public void printHand(List<Card> hand){
        System.out.println(hand.stream().map(Card::toString).collect(Collectors.joining("..")));
    }
}
