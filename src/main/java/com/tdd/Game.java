package com.tdd;

public class Game {
    private GameBoard board;
    private TurnTracker turnTracker;

    public Game(GameBoard board, TurnTracker turnTracker) {
        this.board = board;
        this.turnTracker = turnTracker;
    }

    public void move(int position) {
        turnTracker.broadcastNextPlayer();
        board.storeMove(position);
    }
}
