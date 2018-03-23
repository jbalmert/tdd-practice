package com.tdd;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TicTacToeTest {
    @Mock TicTacToeResultListener tttResultListener;
    @Mock MoveTracker moveTracker;
    @Mock SymbolSwapper symbolSwapper;
    private TicTacToe ticTacToe;

    @Before
    public void configureTicTacToe() {
        ticTacToe = new TicTacToe(tttResultListener, moveTracker, symbolSwapper);
    }

    @Test
    public void getsNextSymbolFromSymbolSwapper() throws Exception {
        ticTacToe.playMove(1);

        verify(symbolSwapper).nextSymbol();
    }

    @Test
    public void moveTrackerTracksCurrentMove() throws Exception {
        when(symbolSwapper.nextSymbol()).thenReturn('x');

        ticTacToe.playMove(5);

        verify(moveTracker).trackMove(5,'x');
    }



}