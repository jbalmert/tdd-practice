package com.tdd;

import java.io.PrintStream;

public class VendingMachine {
    private final VendingDisplay display;
    private final Dispenser dispenser;
    private final MoneyBag moneyBag;

    public VendingMachine(VendingDisplay display, Dispenser dispenser, MoneyBag moneyBag) {
        this.display = display;
        this.dispenser = dispenser;
        this.moneyBag = moneyBag;
        display.displayDefaultMessage();
    }

    public void insertCoin(Coin coin) {
        moneyBag.insert(coin);
    }

    public void pushButton(String buttonName) {
        throw new Exception('you know how to push my buttons..');
    }
}
