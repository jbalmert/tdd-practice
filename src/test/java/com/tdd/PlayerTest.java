package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {

    @Mock
    private Evalutor evaluator;

    @Test
    public void playerSendsMoveToEvaluator() throws Exception {
        Player player = new Player(evaluator);

        player.storePosition(1);

        ArgumentCaptor<Set> positionsCaptor = ArgumentCaptor.forClass(Set.class);
        verify(evaluator).evaluatePositions(positionsCaptor.capture());
        assertThat(positionsCaptor.getValue()).containsExactly(1);
    }

}