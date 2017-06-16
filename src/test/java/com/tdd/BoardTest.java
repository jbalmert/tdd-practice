package com.tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BoardTest {
    @Mock
    private Player player;
    @Mock
    private Players players;
    @Mock
    private DisplayObject displayObject;

    private Board board;


    @Before
    public void setUp() throws Exception {
        board = new Board(players, displayObject);
    }

    @Test
    public void playerPlacesGamePiece() throws Exception {
        when(players.getCurrentPlayer()).thenReturn(player);

        board.place(1);

        verify(player).place(1);
    }

    @Test
    public void displaysWinningMessageWhenGameIsOver() throws Exception {
        when(players.getCurrentPlayer()).thenReturn(player);

        when(players.playerHasWon()).thenReturn(true);
        board.place(1);

        verify(displayObject).wins(player);
    }
}