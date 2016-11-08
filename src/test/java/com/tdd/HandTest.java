package com.tdd;

import org.junit.Test;

public class HandTest {

    private RankEvaluator evaluator;
    private RankIdentifier identifier;

    @Test
    public void identifiesRank() throws Exception {
        Hand hand = new Hand();

        hand.rank(identifier);

    }
}