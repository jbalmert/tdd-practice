package com.tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RankIdentifierTest {

    private List<RankMatcher> rankMatcherList;
    private List<Card> cardList = new ArrayList<>();
    @Mock RankMatcher nonMatchingRankMatcher;
    @Mock RankMatcher rank1Matcher;
    @Mock RankMatcher rank2Matcher;
    @Mock private Rank rank1;
    @Mock private Rank rank2;

    @Before
    public void setUp() throws Exception {
        when(nonMatchingRankMatcher.matches(anyList())).thenReturn(Optional.empty());
        when(rank1Matcher.matches(anyList())).thenReturn(Optional.of(rank1));
        when(rank2Matcher.matches(anyList())).thenReturn(Optional.of(rank2));
    }

    @Test
    public void defersToRankMatchersToDetermineRank() throws Exception {
        rankMatcherList = Arrays.asList(rank1Matcher);
        RankIdentifier rankIdentifier = new RankIdentifier(rankMatcherList);

        rankIdentifier.identifyRank(cardList);

        verify(rank1Matcher).matches(cardList);
    }

    @Test
    public void firstMatchWins() throws Exception {
        rankMatcherList = Arrays.asList(rank1Matcher, rank2Matcher);

        RankIdentifier rankIdentifier = new RankIdentifier(rankMatcherList);

        assertThat(rankIdentifier.identifyRank(cardList)).isEqualTo(rank1);
    }

    @Test
    public void skipsInitialLosers() throws Exception {
        rankMatcherList = Arrays.asList(nonMatchingRankMatcher, nonMatchingRankMatcher, rank1Matcher);

        RankIdentifier rankIdentifier = new RankIdentifier(rankMatcherList);

        assertThat(rankIdentifier.identifyRank(cardList)).isEqualTo(rank1);
    }
}