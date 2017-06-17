package com.tdd;

public class Player {
    private Display display;
    private String name;

    public Player(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void placePiece(int coordinate) {
        display.alertPiecePlaced(name,coordinate);
    }
}
