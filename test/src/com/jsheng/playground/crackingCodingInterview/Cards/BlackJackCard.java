package com.jsheng.playground.crackingCodingInterview.Cards;

public class BlackJackCard extends AbstractCard {
    public BlackJackCard(int c, Suit s) {
        super(c, s);
    }

    @Override
    public int getValue() {
        if (isAce()) { // Ace
            return 1;
        } else if (value >= 11 && value <= 13) { // Face card
            return 10;
        } else { // Number card
            return value;
        }
    }

    public int minValue() {
        if (isAce()) { // Ace
            return 1;
        } else {
            return getValue();
        }
    }

    public int maxValue() {
        if (isAce()) { // Ace
            return 11;
        } else {
            return getValue();
        }
    }

    public boolean isAce() {
        return value == 1;
    }

    public boolean isFaceCard() {
        return value >= 11 && value <= 13;
    }
}