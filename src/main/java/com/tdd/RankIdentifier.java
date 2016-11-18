package com.tdd;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RankIdentifier {
    private List<RankMatcher> rankMatcherList;

    public RankIdentifier(List<RankMatcher> rankMatcherList) {
        this.rankMatcherList = rankMatcherList;
    }

    public Rank identifyRank(List<Card> cardList) {
        return rankMatcherList.stream()
                .map(rankMatcher -> rankMatcher.matches(cardList))
                .flatMap(o -> o.isPresent() ? Stream.of(o.get()) : Stream.empty())
                .findFirst().orElseThrow(IllegalStateException::new);

    }
}
