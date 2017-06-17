package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class TicTacToeE2ETest {

    @Mock
    private Display display;
    @Mock
    private Players players;

    @Test
    public void playerXWins() throws Exception {
        Board board = new Board(players);

        board.place(1);
        verify(display).alertPiecePlaced("X",1);
        board.place(2);
        verify(display).alertPiecePlaced("Y",2);
        board.place(4);
        verify(display).alertPiecePlaced("X",4);
        board.place(3);
        verify(display).alertPiecePlaced("Y",3);
        board.place(7);

        verify(display).wins();
    }
}
