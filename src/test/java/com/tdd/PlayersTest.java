package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PlayersTest {

    @Mock private PlayerFactory playerFactory;
    @Mock private Player playerX;
    @Mock private Player playerO;

    @Test
    public void alternatesPlayersWhenNextPlayerCalled() throws Exception {
        when(playerFactory.createPlayer()).thenReturn(playerX, playerO);
        Players players = new Players(playerFactory);

        Player player1 = players.getNextPlayer();
        Player player2 = players.getNextPlayer();

        assertThat(player1).isSameAs(playerX);
        assertThat(player2).isSameAs(playerO);
    }
}