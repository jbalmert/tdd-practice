package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {

    @Mock
    private Display display;

    @Test
    public void playerDisplaysPiecePlaced() throws Exception {
        Player player = new Player(display, "X");
        player.placePiece(1);
        verify(display).alertPiecePlaced("X",1);
    }
}