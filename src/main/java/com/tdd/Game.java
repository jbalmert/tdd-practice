package com.tdd;

public class Game {
    private GameBoard board;

    public Game(GameBoard board) {
        this.board = board;
    }

    public void move(int position) {
        board.storeMove(position);
    }
}
