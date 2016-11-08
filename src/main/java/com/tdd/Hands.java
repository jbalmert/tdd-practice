package com.tdd;

import java.util.List;

public class Hands {
    private List<Hand> hands;
    private RankEvaluator rankEvaluator;
    private HandToRankMapper handToRankMapper;

    public Hands(List<Hand> hands, RankEvaluator rankEvaluator, HandToRankMapper handToRankMapper) {
        this.hands = hands;
        this.rankEvaluator = rankEvaluator;
        this.handToRankMapper = handToRankMapper;
    }

    public WinningHands evaluate() {
        List<Rank> rankList= handToRankMapper.map(hands);
        return rankEvaluator.evaluate(rankList);
    }
}
