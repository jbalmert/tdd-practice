package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TicTacToeEndToEndTest {

    @Mock GameDisplay display;

    Players players = new Players();

    @Test
    public void xWinsGame() throws Exception {
        TicTacToe game = new TicTacToe(players);

        game.move(1);
        game.move(2);
        game.move(4);
        game.move(3);
        game.move(7);

        verify(display).gameWon();
    }
}
