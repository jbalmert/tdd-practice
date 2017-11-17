package com.tdd;

public class VendingMachine {

    private MoneyTracker moneyTracker;

    public VendingMachine(MoneyTracker moneyTracker) {
        this.moneyTracker = moneyTracker;
    }

    public void insertCoin(Coin coin) {
        moneyTracker.track(coin);
    }

    public void pushButton(VendingButton button) {
    }

    public Product checkBin() {
        return null;
    }
}
