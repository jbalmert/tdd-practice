package com.tdd;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private Set<Integer> positions = new HashSet<>();
    private Evalutor evaluator;

    public Player(Evalutor evaluator) {
        this.evaluator = evaluator;
    }

    public void storePosition(int position) {
        positions.add(position);
        this.evaluator.evaluatePositions(positions);
    }
}
