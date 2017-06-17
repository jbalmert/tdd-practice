package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BoardTest {
    @Mock private Player playerX;
    @Mock private Players players;

    @Test
    public void playerPlacesPiece() throws Exception {
        when(players.getNextPlayer()).thenReturn(playerX);
        Board board = new Board(players);

        board.place(1);

        verify(playerX).placePiece(1);
    }
}