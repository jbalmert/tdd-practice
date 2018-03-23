package com.tdd;

import java.util.HashMap;
import java.util.Map;

public class MoveTracker {

    private final GameEvaluator gameEvaluator;
    private Map<Character, Moves> movesMap = new HashMap<>();

    public MoveTracker(GameEvaluator gameEvaluator, Moves xMoves, Moves oMoves) {
        this.gameEvaluator = gameEvaluator;
        movesMap.put('x', xMoves);
        movesMap.put('o', oMoves);
    }


    public void trackMove(int square, char symbol) {
        gameEvaluator.evaluateResults(movesMap.get(symbol), symbol);
    }
}
