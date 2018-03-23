package com.tdd;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class MoveTrackerTest {

    @Mock GameEvaluator gameEvaluator;
    @Mock Moves xMoves;
    @Mock Moves oMoves;

    @Test
    public void evaluatorSezDaResults() throws Exception {
        MoveTracker moveTracker = new MoveTracker(gameEvaluator, xMoves, oMoves);

        moveTracker.trackMove(2, 'x');

        verify(gameEvaluator).evaluateResults(xMoves, 'x');
    }

    @Test
    public void oMovesCanBeEvaluatedToo() throws Exception {
        MoveTracker moveTracker = new MoveTracker(gameEvaluator, xMoves, oMoves);

        moveTracker.trackMove(2, 'o');

        verify(gameEvaluator).evaluateResults(oMoves, 'o');

    }
}