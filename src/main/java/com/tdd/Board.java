package com.tdd;

public class Board {
    private Players players;

    public Board(Players players) {
        this.players = players;
    }

    public void place(int mark) {
        players.getNextPlayer().placePiece(mark);
    }
}
