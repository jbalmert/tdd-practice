package com.tdd;

import java.io.BufferedReader;
import java.io.IOException;

public class ConnectFourCommandLine {
    private BufferedReader input;
    private ConnectFourGame connectFourGame;

    public ConnectFourCommandLine(BufferedReader input, ConnectFourGame connectFourGame) {
        this.input = input;
        this.connectFourGame = connectFourGame;
    }

    public void acceptNextMove() throws IOException {
        String readValue = input.readLine();
        int value = Integer.parseInt(readValue);
        connectFourGame.placeMoveInColumn(value);
    }
}
