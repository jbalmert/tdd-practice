package com.tdd;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MoneyBagTest {

    @Mock
    private VendingDisplay display;
    private MoneyBag moneyBag;

    @Before
    public void setup(){
        moneyBag = new MoneyBag(display);
    }

    @Test
    public void whenCoinInsertedDisplayUpdated() throws Exception {
        moneyBag.insert(Coin.QUARTER);

        verify(display).showMoneyBagTotal(25);
    }

    @Test
    public void whenMultipleCoinsInsertedDisplayReflectsTotal() throws Exception {
        moneyBag.insert(Coin.QUARTER);
        moneyBag.insert(Coin.QUARTER);

        verify(display).showMoneyBagTotal(50);
    }
}