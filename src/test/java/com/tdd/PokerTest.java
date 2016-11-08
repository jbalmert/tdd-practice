package com.tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PokerTest {

    @Mock Hands hands;
    @Mock WinningHands winningHands;
    private Poker poker;

    @Before
    public void configurePoker() {
        poker = new Poker();
        when(hands.evaluate()).thenReturn(winningHands);
    }

    @Test
    public void tellsHandsToEvaluate() {
        poker.evaluate(hands);

        verify(hands).evaluate();
    }

    @Test
    public void tellsWinningHandsToDisplay() {
        poker.evaluate(hands);

        verify(winningHands).display();
    }
}
