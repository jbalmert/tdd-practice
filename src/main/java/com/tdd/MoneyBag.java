package com.tdd;

public class MoneyBag {
    private final VendingDisplay display;
    private int total;

    public MoneyBag(VendingDisplay display) {
        total = 0;
        this.display = display;
    }

    public void insert(Coin quarter) {
        total += quarter.getValue();
        display.showMoneyBagTotal(total);
    }
}
