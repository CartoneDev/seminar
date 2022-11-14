
package cz.cvut.fel.omo.server.server;

import cz.cvut.fel.omo.server.Observer;

import javax.money.MonetaryAmount;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StockExchangeServer {

    private static volatile StockExchangeServer instance;

    private final Map<CurrencyName, CryptoCurrencyController> controllerMap = new HashMap<>();

    private StockExchangeServer() {
        controllerMap.put(CurrencyName.BITCOIN, new BitcoinController());
        controllerMap.put(CurrencyName.LITECOIN, new LitecoinController());
    }

    public static StockExchangeServer getInstance() {
        if (instance == null) {
            synchronized (StockExchangeServer.class) {
                if (instance == null) {
                    instance = new StockExchangeServer();
                }
            }
        }

        return instance;
    }

    public void subscribeUpdates(CryptoCurrency currency, Observer observer) {
        this.controllerMap.get(currency.getCurrencyName()).attach(observer);
    }

    public void unsubscribeUpdates(CryptoCurrency currency, Observer observer) {
        this.controllerMap.get(currency.getCurrencyName()).detach(observer);
    }

    /*
     * Method for computing new price for cryptocurrency.
     */
    public void computeMarketFluctuation() {
        this.controllerMap.values().forEach(CryptoCurrencyController::changePrice);
    }

    public MonetaryAmount getState(CryptoCurrency currency) {
        return this.controllerMap.get(currency.getCurrencyName()).getState();
    }

    public Collection<CryptoCurrency> getAllCurrencies() {
        return this.controllerMap.values()
                                 .stream()
                                 .map(CryptoCurrencyController::getCurrency)
                                 .collect(Collectors.toList());
    }
}
