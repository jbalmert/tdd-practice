package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TicTacToeEndToEndTest {

    @Mock TicTacToeResultListener tttResultListener;
    private Moves xMoves = new Moves();
    private Moves oMoves = new Moves();

    private MoveTracker moveTracker = new MoveTracker(new GameEvaluator(), xMoves, oMoves);
    private SymbolSwapper symbolSwapper = new SymbolSwapper();

    @Test
    public void XWins() throws Exception {
        TicTacToe ttt = new TicTacToe(tttResultListener, moveTracker, symbolSwapper);

        ttt.playMove(5); //x middle middle
        ttt.playMove(9); //o bottom right
        ttt.playMove(6); //x middle right
        ttt.playMove(3); //o top right
        ttt.playMove(4); //x middle left

        verify(tttResultListener).xWins();
    }
}
