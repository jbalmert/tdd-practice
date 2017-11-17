package com.tdd;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VendingMachineE2ETest {

    private MoneyTracker moneyTracker = new MoneyTracker();

    @Test
    public void vendingMachineVendsChipsWhenProperChangeInserted(){
        VendingMachine vendingMachine = new VendingMachine(moneyTracker);

        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.insertCoin(Coin.DIME);
        vendingMachine.pushButton(VendingButton.CHIPS);
        Product product = vendingMachine.checkBin();

        assertThat(product).isNotNull();
        assertThat(product).isInstanceOf(Chips.class);
    }
}
