package com.tdd;

import java.util.List;

public class Hands {
    private List<Hand> hands;
    private RankEvaluator rankEvaluator;
    private RankIdentifier identifier;

    public Hands(List<Hand> hands, RankEvaluator rankEvaluator, RankIdentifier identifier) {
        this.hands = hands;
        this.rankEvaluator = rankEvaluator;
        this.identifier = identifier;
    }

    public WinningHands evaluate() {
        hands.forEach(hand -> hand.rank(rankEvaluator, identifier));
        hands.forEach(hand -> hand.rank(rankEvaluator, identifier));
        return rankEvaluator.evaluate();
    }
}
