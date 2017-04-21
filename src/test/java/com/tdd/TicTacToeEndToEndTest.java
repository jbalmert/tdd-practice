package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TicTacToeEndToEndTest {

    @Mock
    PrintStream printer;
    private GameBoard board = new GameBoard();
    private TurnTracker turnTracker = new TurnTracker();
    private GameEvaluator gameEvaluator = new GameEvaluator();

    @Test
    public void playerXWins() throws Exception {
        Game game = new Game(board, turnTracker, gameEvaluator);

        game.move(1);
        game.move(5);
        game.move(2);
        game.move(9);
        game.move(3);

        verify(printer).println("Player X wins");
    }
}
