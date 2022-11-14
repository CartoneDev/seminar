package cz.cvut.fel.omo.server.server;

import org.javamoney.moneta.Money;

public class Bitcoin extends CryptoCurrency {

    public Bitcoin() {
        currencyName = CurrencyName.BITCOIN;
        price = Money.of(8000, "EUR");
    }
}
