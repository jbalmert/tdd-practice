package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ConnectFourGameTest {

    @Mock private Display display;

    @Test
    public void sendsMoveToDisplay() throws Exception {
        ConnectFourGame game = new ConnectFourGame(display);

        game.placeMoveInColumn(3);

        verify(display).updateDisplay("P1",3,0);
    }
}