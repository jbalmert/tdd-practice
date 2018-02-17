package com.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class VendingMachineEndToEndTest {

    @Mock
    private Dispenser dispenser;

    @Mock
    private VendingDisplay vendDisplay;

    @Test
    public void vendsABagOfChips() {
        VendingMachine machine = new VendingMachine(vendDisplay, dispenser, new MoneyBag(vendDisplay));

        verify(vendDisplay).displayDefaultMessage();

        machine.insertCoin(Coin.QUARTER);
        verify(vendDisplay).showMoneyBagTotal(25);

        machine.insertCoin(Coin.QUARTER);
        verify(vendDisplay).showMoneyBagTotal(50);

        machine.pushButton("B4");
        verify(dispenser).vend("bag o' chips");
        verify(vendDisplay).displayDefaultMessage();
    }
}
