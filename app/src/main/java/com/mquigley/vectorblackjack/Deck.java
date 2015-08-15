package com.mquigley.vectorblackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by mquigley on 8/13/15.
 */
public class Deck
{
    private ArrayList<Card> cards;
    private int idx;

    /**
     * Creates a new Deck object containing n card decks
     * @param n number of decks
     */
    public Deck(int n)
    {
        cards = new ArrayList<Card>();
        idx=0;

        for(int i=0;i<n;i++)
        {
            addCards(Card.Suit.CLUBS);
            addCards(Card.Suit.DIAMONDS);
            addCards(Card.Suit.HEARTS);
            addCards(Card.Suit.SPADES);
        }
    }

    /**
     * Shuffle the deck
     */
    public void shuffle()
    {
        Random rand = new Random();
        idx = 0;
        int r;
        Card c;

        //Fisher-Yates algorithm
        for(int i = cards.size() - 1; i > 0; i--)
        {
            r = rand.nextInt(i + 1);
            c = cards.get(r);
            cards.set(r, cards.get(i));
            cards.set(i, c);
        }
    }

    /**
     * Get a card from the deck
     * @return a card
     */
    public Card draw()
    {
        return cards.get(idx++);
    }

    /**
     * @return The number of cards remaining in the deck
     */
    public int cardsRemaining()
    {
        return cards.size() - idx;
    }

    /**
     * Adds all cards in a given suit to the deck
     * @param s Suit
     */
    private void addCards(Card.Suit s)
    {
        cards.add(new Card(s, 'A', 11));
        cards.add(new Card(s, '2', 2));
        cards.add(new Card(s, '3', 3));
        cards.add(new Card(s, '4', 4));
        cards.add(new Card(s, '5', 5));
        cards.add(new Card(s, '6', 6));
        cards.add(new Card(s, '7', 7));
        cards.add(new Card(s, '8', 8));
        cards.add(new Card(s, '9', 9));
        cards.add(new Card(s, 'X', 10));
        cards.add(new Card(s, 'J', 10));
        cards.add(new Card(s, 'Q', 10));
        cards.add(new Card(s, 'K', 10));
    }
}
