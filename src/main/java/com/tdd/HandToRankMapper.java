package com.tdd;

import java.util.List;
import java.util.stream.Collectors;

public class HandToRankMapper {
    private RankIdentifier rankIdentifier;

    public HandToRankMapper(RankIdentifier rankIdentifier) {
        this.rankIdentifier = rankIdentifier;
    }

    public List<Rank> map(List<Hand> handList) {
        return handList.stream().map(hand -> hand.rank(rankIdentifier)).collect(Collectors.toList());
    }
}
