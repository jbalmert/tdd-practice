package com.tdd;

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
public class HandToRankMapperTest {

    private List<Hand> handList = new ArrayList<>();
    @Mock Hand hand;
    @Mock RankIdentifier rankIdentifier;
    @Mock Hand hand2;
    @Mock Rank rank1;
    @Mock Rank rank2;

    @Test
    public void asksEachHandToGenerateItsRank() throws Exception {
        handList.add(hand);
        HandToRankMapper mapper = new HandToRankMapper(rankIdentifier);

        mapper.map(handList);

        verify(hand).rank(rankIdentifier);
    }
    
    @Test
    public void collectsRanksFromHands() {
        handList.add(hand);
        handList.add(hand2);
        when(hand.rank(rankIdentifier)).thenReturn(rank1);
        when(hand2.rank(rankIdentifier)).thenReturn(rank2);
        HandToRankMapper mapper = new HandToRankMapper(rankIdentifier);

        List<Rank> result = mapper.map(handList);

        assertThat(result).containsExactly(rank1, rank2);
    }
}