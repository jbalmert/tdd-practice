package com.tdd;

public class TicTacToe {
    private Players players;

    public TicTacToe(Players players) {

        this.players = players;
    }

    public void move(int position) {
        Player currentPlayer = players.getNextPlayer();
        currentPlayer.storePosition(position);
    }
}
