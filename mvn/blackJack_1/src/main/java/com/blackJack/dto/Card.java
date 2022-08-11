package com.blackJack.dto;

public class Card {
    private final Suit suit;
    private final Rank rank;
    private final int cost;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        this.cost = rank.getCost();
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s%s", rank.getName(), suit.getSymbol());
    }

}
