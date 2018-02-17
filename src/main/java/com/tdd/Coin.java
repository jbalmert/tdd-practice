package com.tdd;

public enum Coin {
    QUARTER(25);

    private int value;

    Coin(int value) {

        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
