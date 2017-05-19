package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.BufferedReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ConnectFourCommandLineTest {

    @Mock BufferedReader input;
    @Mock ConnectFourGame connectFourGame;

    @Test
    public void sendsRequestedMoveToGame() throws Exception {
        when(input.readLine()).thenReturn("3");
        ConnectFourCommandLine cli = new ConnectFourCommandLine(input, connectFourGame);

        cli.acceptNextMove();

        verify(connectFourGame).placeMoveInColumn(3);
    }
}