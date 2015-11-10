package com.jsheng.playground.crackingCodingInterview.Cards;

import java.util.ArrayList;

public abstract class AbstractHand <T extends AbstractCard> {
    protected ArrayList<T> cards = new ArrayList<T>();

    public int score() {
        int score = 0;
        for (T card : cards) {
            score += card.getValue();
        }
        return score;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public void print() {
        for (T card : cards) {
            card.print();
        }
    }
}