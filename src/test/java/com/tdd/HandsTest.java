package com.tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

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
    private List<Hand> handList = new ArrayList<>();
    @Mock HandToRankMapper handToRankMapper;
    private List<Rank> rankList = new ArrayList<>();


    @Before
    public void configureHands() {
        when(handToRankMapper.map(handList)).thenReturn(rankList);
        when(rankEvaluator.evaluate(rankList)).thenReturn(winningHands);
        when(rankEvaluator.evaluate(rankList)).thenReturn(winningHands);
    }

    @Test
    public void mapsHandsToRanks() {
        Hands hands = new Hands(handList, rankEvaluator, handToRankMapper);

        hands.evaluate();

        verify(handToRankMapper).map(handList);
    }

    @Test
    public void evaluateRanksEachHand() throws Exception {
        Hands hands = new Hands(handList, rankEvaluator, handToRankMapper);

        hands.evaluate();

        rankEvaluator.evaluate(rankList);
    }

    @Test
    public void tellRankEvaluatorToEvaluate() throws Exception {
        Hands hands = new Hands(handList, rankEvaluator, handToRankMapper);

        WinningHands result = hands.evaluate();

        assertThat(result).isSameAs(winningHands);
    }
}