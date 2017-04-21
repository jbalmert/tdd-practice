package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock GameBoard board;

    @Test
    public void storesPositionOfMove() throws Exception {
        Game game = new Game(board);

        game.move(1);

        verify(board).storeMove(1);
    }
}