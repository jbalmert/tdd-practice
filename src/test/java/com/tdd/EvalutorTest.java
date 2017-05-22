package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EvalutorTest {

    @Mock private Solutions solutions;
    @Mock private GameDisplay display;
    private Set<Integer> positions = new HashSet<>();

    @Test
    public void displaysWinnnerWhenSolutionMatchesPositions() throws Exception {
        Evalutor evalutor = new Evalutor(solutions, display);
        when(solutions.hasMatch(positions)).thenReturn(true);

        evalutor.evaluatePositions(positions);

        verify(display).gameWon();
    }

    @Test
    public void doesNotCallDisplayWhenSolutionDoesNotMatchPositions() throws Exception {
        Evalutor evalutor = new Evalutor(solutions, display);
        when(solutions.hasMatch(positions)).thenReturn(false);

        evalutor.evaluatePositions(positions);

        verifyZeroInteractions(display);
    }


}