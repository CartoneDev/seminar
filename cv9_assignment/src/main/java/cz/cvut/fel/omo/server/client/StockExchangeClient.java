package cz.cvut.fel.omo.server.client;

import cz.cvut.fel.omo.server.server.CryptoCurrency;
import cz.cvut.fel.omo.server.server.CurrencyName;
import cz.cvut.fel.omo.server.server.StockExchangeServer;

import java.util.HashMap;
import java.util.Map;

public class StockExchangeClient {

    private final StockExchangeServer stockExchangeServer;
    private final String name;

    private final Map<CurrencyName, CurrencyClient> clients = new HashMap<>();

    public StockExchangeClient(StockExchangeServer stockExchange, String name) {
        this.stockExchangeServer = stockExchange;
        this.name = name;
    }

    private void subscribeToUpdates(CryptoCurrency currency) {
        this.clients.putIfAbsent(currency.getCurrencyName(), new CurrencyClient(currency));
        this.stockExchangeServer.subscribeUpdates(currency, clients.get(currency.getCurrencyName()));
    }

    /*
     * Method makes sure, that this client application is subscribed to both litecoin and bitcoin channel.
     */
    public void subscribeToAllChannels() {
        this.stockExchangeServer.getAllCurrencies().forEach(this::subscribeToUpdates);
    }

    /*
     * Method unsubscribes application from bitcoin channel, hereafter no notifications about bitcoin price will be delivered.
     */
    public void unsubscribeFromBitcoinChannel() {
        stockExchangeServer.unsubscribeFromBitcoinChannel(this.bitcoinClient);
    }

    /*
     * Method unsubscribes application from litecoin channel, hereafter no notifications about litecoin price will be delivered.
     */
    public void unsubscribeFromLitecoinChannel() {
        stockExchangeServer.unsubscribeFromLitecoinChannel(this.litecoinClient);
    }

    /*
     * Method unsubscribes application from both bitcoin and litecoin channels, hereafter no notifications about bitcoin nor litecoin price will be delivered.
     */
    public void unsubscribeFromAllChannels() {
        this.unsubscribeFromBitcoinChannel();
        this.unsubscribeFromLitecoinChannel();
    }

    public String getName() {
        return name;
    }

    public StockExchangeServer getServer() {
        return stockExchangeServer;
    }
}
