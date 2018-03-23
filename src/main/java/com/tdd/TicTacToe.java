package com.tdd;

public class TicTacToe {
    private final TicTacToeResultListener tttResultListener;
    private final MoveTracker moveTracker;
    private final SymbolSwapper symbolSwapper;

    public TicTacToe(TicTacToeResultListener tttResultListener, MoveTracker moveTracker, SymbolSwapper symbolSwapper) {
        this.tttResultListener = tttResultListener;
        this.moveTracker = moveTracker;
        this.symbolSwapper = symbolSwapper;
    }

    public void playMove(int square) {
        char symbolThatCameBack = symbolSwapper.nextSymbol();

        moveTracker.trackMove(square,symbolThatCameBack);
    }
}
