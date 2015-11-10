package com.jsheng.playground.crackingCodingInterview.Cards;

public enum Suit {
    CLUB,
    DIAMOND,
    HEART,
    SPADE;

    private Suit() {
        //Cannot initialize
    }

    public static Suit getSuitFromValue(int v) {
        switch(v) {
            case 0:
                return Suit.CLUB;
            case 1:
                return Suit.DIAMOND;
            case 2:
                return Suit.HEART;
            case 3:
                return Suit.SPADE;
            default:
                return null;
        }
    }
}
