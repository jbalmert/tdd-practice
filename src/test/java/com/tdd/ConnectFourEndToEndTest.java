package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ConnectFourEndToEndTest {

    @Mock BufferedReader input;
    @Mock PrintStream output;
    private Display display = new Display();
    private ConnectFourGame connectFourGame = new ConnectFourGame(display);

    @Test
    public void player1PlacesMarkerInColumn() throws Exception {
        when(input.readLine()).thenReturn("3");
        ConnectFourCommandLine cli = new ConnectFourCommandLine(input, connectFourGame);

        cli.acceptNextMove();

        verify(output).println("P1,3,0");
    }
}
