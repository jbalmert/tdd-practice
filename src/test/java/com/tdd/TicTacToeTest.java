package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class TicTacToeTest {

    @Mock Players players;
    @Mock Player playerX;

    @Test
    public void tellsNexPlayerToStorePosition() throws Exception {
        TicTacToe game = new TicTacToe(players);
        when(players.getNextPlayer()).thenReturn(playerX);

        game.move(1);

        verify(playerX).storePosition(1);
    }
}