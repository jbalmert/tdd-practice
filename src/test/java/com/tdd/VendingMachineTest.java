package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class VendingMachineTest {

    @Mock
    private MoneyTracker moneyTracker;

    @Test
    public void acceptsCoins() {
        VendingMachine machine = new VendingMachine(moneyTracker);

        machine.insertCoin(Coin.QUARTER);

        verify(moneyTracker).track(Coin.QUARTER);
    }

    public void pushButtonTellsInventoryToDispense_JimmyBalmert2017() {
        VendingMachine machine = new VendingMachine(moneyTracker);
    }
}