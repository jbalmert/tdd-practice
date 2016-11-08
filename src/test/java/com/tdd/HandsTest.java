package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class HandsTest {

    @Mock Hand hand1;
    @Mock Hand hand2;
    @Mock WinningHands winningHands;
    @Mock RankEvaluator rankEvaluator;
    @Mock RankIdentifier identifier;

    @Test
    public void evaluateRanksEachHand() throws Exception {
        Hands hands = new Hands(Arrays.asList(hand1, hand2), rankEvaluator, identifier);

        hands.evaluate();

        verify(hand1).rank(rankEvaluator, identifier);
        verify(hand2).rank(rankEvaluator, identifier);
    }

    @Test
    public void tellRankEvaluatorToEvaluate() throws Exception {
        when(rankEvaluator.evaluate()).thenReturn(winningHands);
        Hands hands = new Hands(Arrays.asList(hand1, hand2), rankEvaluator, identifier);

        WinningHands result = hands.evaluate();

        assertThat(result).isSameAs(winningHands);
    }
}