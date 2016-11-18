package com.tdd;

import java.util.List;

public class Hand {
    private List<Card> cardList;

    public Hand(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Rank rank(RankIdentifier identifier) {
        return identifier.identifyRank(cardList);
    }
}
