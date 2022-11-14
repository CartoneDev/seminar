package cz.cvut.fel.omo.server;

import javax.money.MonetaryAmount;

public interface Observer {

    void update(MonetaryAmount currentValue);
}
