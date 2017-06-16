package com.tdd;

public class Board {
    private Players players;
    private DisplayObject displayObject;

    public Board(Players players, DisplayObject displayObject) {
        this.players = players;
        this.displayObject = displayObject;
    }

    public void place(int mark) {
        //get current player
        Player currentPlayer = players.getCurrentPlayer();

        //player to place a mark
        currentPlayer.place(mark);

        //check if game is over

        //display to send message
        displayObject.wins(currentPlayer);
    }
}
