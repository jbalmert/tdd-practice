package com.tdd;

import java.util.Set;

public class Evalutor {
    private Solutions solutions;
    private GameDisplay display;

    public Evalutor(Solutions solutions, GameDisplay display) {
        this.solutions = solutions;
        this.display = display;
    }

    public void evaluatePositions(Set<Integer> positions) {
        if( solutions.hasMatch(positions) ) {
            display.gameWon();
        }
    }
}
