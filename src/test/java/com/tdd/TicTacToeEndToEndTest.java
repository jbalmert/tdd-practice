package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TicTacToeEndToEndTest {

    private Players players;
    @Mock DisplayObject displayObject;
    Board board = new Board(players, displayObject);

    @Test
    public void playerXWinsAGame() throws Exception {
        Player player = new Player();

        board.place(1);
        verify(displayObject).displayMessage("player X places at position 1");
        board.place(2);
        verify(displayObject).displayMessage("player O places at position 2");
        board.place(4);
        verify(displayObject).displayMessage("player X places at position 4");
        board.place(3);
        verify(displayObject).displayMessage("player O places at position 3");
        board.place(7);
        verify(displayObject).wins(player);
    }
}
