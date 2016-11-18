package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HandTest {
    private List<Card> cardList;

    @Mock RankIdentifier identifier;
    @Mock Card card1;
    @Mock Card card2;

    @Test
    public void identifiesRank() throws Exception {
        cardList = Arrays.asList(card1, card2);
        Hand hand = new Hand(cardList);

        hand.rank(identifier);

        verify(identifier).identifyRank(cardList);
    }
}