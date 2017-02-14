package com.tdd;

/**
 * Created by jimmy.balmert on 2/7/17.
 */
public class Board {
    private String state;

    public Board(String state) {

        this.state = state;
    }

    @Override
    public String toString() {
        return state;
    }

    public CellState getCell() {
        return null;
    }
}
