package com.tdd;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;


@RunWith(MockitoJUnitRunner.class)
public class VendingMachineTest {

    @Mock
    private VendingDisplay display;

    @Mock
    private Dispenser dispenser;

    @Mock
    private MoneyBag moneyBag;

    private VendingMachine machine;

    @Before
    public void setup() {
        machine = new VendingMachine(display, dispenser, moneyBag);
    }

    @Test
    public void tellsDisplayToAskForCoinsOnStartup() throws Exception {
        verify(display).displayDefaultMessage();
    }

    @Test
    public void insertCoinDepositsCoinInMoneyBag() throws Exception {
        machine.insertCoin(Coin.QUARTER);
        verify(moneyBag).insert(Coin.QUARTER);
    }


}