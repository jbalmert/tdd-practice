package com.tdd;

public class Players {
    private final Player playerX;
    private final Player playerO;

    private Player currentPlayer;


    public Players(PlayerFactory playerFactory) {
        this.playerX = playerFactory.createPlayer();
        this.playerO = playerFactory.createPlayer();
        currentPlayer = playerO;
    }

    public Player getNextPlayer() {
        currentPlayer = currentPlayer == playerX ? playerO : playerX;
        return currentPlayer;
    }
}
