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

    public String toString()
    {
        String suitString;

        switch(suit)
        {
            case SPADES:
                suitString = "♠";
                break;
            case CLUBS:
                suitString = "♣";
                break;
            case HEARTS:
                suitString = "♥";
                break;
            case DIAMONDS:
                suitString = "♦";
                break;
            default:
                suitString = "☺";
        }

        return String.format("%1%2", suitString, name);
    }
}
