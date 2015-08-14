package com.mquigley.vectorblackjack;

/**
 * Created by mquigley on 8/13/15.
 */
public class Card
{
    public enum Suit{SPADES, CLUBS, HEARTS, DIAMONDS};

    public Suit suit;
    public char name;
    public int value;

    public Card(Suit s, char n, int v)
    {
        suit = s;
        name = n;
        value = v;
    }
}
