package com.jsheng.playground.crackingCodingInterview.Cards;


public abstract class AbstractCard {
    protected int value;
    private  Suit suit;
    private boolean available = true;

    public AbstractCard(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    // Needs to be overridden
    public abstract int getValue();

    public boolean Available() {
        return available;
    }

    public void toggleAvailable() {
        if (available) {
            available = false;
        } else {
            available = true;
        }
    }

    public void print() {
        String[] faceValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        char suitLetter;
        switch(suit) {
            case HEART:
                suitLetter = 'h';
            case SPADE:
                suitLetter = 's';
            case DIAMOND:
                suitLetter = 'd';
            default:
                suitLetter = 'c';
        }
        System.out.print(faceValues[value-1] + suitLetter + " ");
    }
}
