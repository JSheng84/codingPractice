package com.jsheng.playground.crackingCodingInterview.Cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck <T extends AbstractCard> {
    private ArrayList<T> cards;
    private int totalCards;
    private int index = 0;

    public Deck(int total) {
        this.totalCards = total;
    }

    public void setDeckOfCards(ArrayList<T> cardDeck) throws Throwable {
        if (cardDeck.size() != totalCards) {
            throw new Exception("Deck size isn't equal to card size");
        }
        cards = cardDeck;
    }

    public void shuffle() throws Throwable {
        if (cards.size() != totalCards) {
            throw new Exception("Deck of cards has not been initialized!");
        }
        for (int i = 0; i < cards.size(); i++) {
            Random generator = new Random();
            int j = generator.nextInt(cards.size() - 1);
            T card1 = cards.get(i);
            T card2 = cards.get(j);
            cards.set(i, card2);
            cards.set(j, card1);
        }

        for (T card : cards) {
            if (!card.Available()) {
                card.toggleAvailable();
            }
        }
    }

    public void print() {
        for (T card : cards) {
            card.print();
        }
    }

    public int remainingCards() {
        return cards.size() - index;
    }

    public T dealCard() {
        if (remainingCards() == 0) {
            return null;
        }
        T card = cards.get(index);
        if (card.Available()) {
            card.toggleAvailable();
        }
        index++;

        return card;
    }
}
