package cz.cvut.fel.omo.client;

import cz.cvut.fel.omo.Observer;
import cz.cvut.fel.omo.server.CryptoCurrency;

import javax.money.MonetaryAmount;

public class CurrencyClient implements Observer {

    private CryptoCurrency currency;

    public CurrencyClient(CryptoCurrency currency) {
        this.currency = currency;
    }

    @Override
    public void update(MonetaryAmount currentValue) {
        System.out.println("Current value of bitcoin is: " + currentValue);
    }
}
