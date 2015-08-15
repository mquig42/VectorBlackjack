package com.mquigley.vectorblackjack;

import java.util.ArrayList;

/**
 * Created by mquigley on 8/15/15.
 */
public class Hand
{
    private ArrayList<Card> cards;

    public Hand()
    {
        cards = new ArrayList<Card>();
    }

    /**
     * @return The total value of all cards in the hand, taking aces into account
     */
    public int value()
    {
        int v = 0;
        int aces = 0;
        int i;

        for(i = 0; i < cards.size(); i++)
        {
            v += cards.get(i).value;
            if(cards.get(i).name == 'A')
            {
                aces++;
            }
        }

        //Aces are usually worth 11, but can drop in value to 1 to keep hand value under 21
        while((v > 21)&&(aces > 0))
        {
            v -= 10;
            aces--;
        }

        return v;
    }

    /**
     * Adds a card to the hand
     * @param c
     */
    public void addCard(Card c)
    {
        cards.add(c);
    }

    /**
     * @return all cards in the hand, for UI purposes
     */
    public ArrayList<Card> getCards()
    {
        return cards;
    }
}
