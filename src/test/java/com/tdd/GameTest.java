package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock GameBoard board;
    @Mock TurnTracker turnTracker;
    @Mock GameEvaluator gameEvaluator;

    @Test
    public void storesPositionOfMove() throws Exception {
        Game game = new Game(board, turnTracker, gameEvaluator);

        game.move(1);

        verify(board).storeMove(1);
    }

    @Test
    public void tellsTurnTrackerToBroadcastNextPlayer() throws Exception {
        Game game = new Game(board, turnTracker, gameEvaluator);

        game.move(1);

        verify(turnTracker).broadcastNextPlayer();
    }

    @Test
    public void evaluatesTheStateOfTheGame() throws Exception {
        Game game = new Game(board, turnTracker, gameEvaluator);

        game.move(1);

        verify(board).evaluate(gameEvaluator);
    }
}