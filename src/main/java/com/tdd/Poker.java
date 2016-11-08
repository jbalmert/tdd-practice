package com.tdd;

public class Poker {
    public void evaluate(Hands hands) {
        WinningHands winners = hands.evaluate();
        winners.display();
    }
}
