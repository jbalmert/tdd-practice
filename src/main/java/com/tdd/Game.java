package com.tdd;

public class Game {
    private GameBoard board;
    private TurnTracker turnTracker;
    private GameEvaluator gameEvaluator;

    public Game(GameBoard board, TurnTracker turnTracker, GameEvaluator gameEvaluator) {
        this.board = board;
        this.turnTracker = turnTracker;
        this.gameEvaluator = gameEvaluator;
    }

    public void move(int position) {
        turnTracker.broadcastNextPlayer();
        board.storeMove(position);
        board.evaluate(gameEvaluator);
    }
}
