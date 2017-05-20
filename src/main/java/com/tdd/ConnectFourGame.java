package com.tdd;

public class ConnectFourGame {
    private Display display;

    public ConnectFourGame(Display display) {
        this.display = display;
    }

    public void placeMoveInColumn(int column) {
            display.updateDisplay("P1",column,0);
    }
}
