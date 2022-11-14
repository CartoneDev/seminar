package cz.cvut.fel.omo.cv8.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
    protected final String name;
    protected final Currency currency;
    protected final User owner;
    protected Long ammount = 0L;
    protected Long fee;
    protected Integer interest;
    protected List<User> disponents = new ArrayList<>();

    public Account(String name, Currency currency, User owner, Long fee, Integer interest) {
        this.name = name;
        this.currency = currency;
        this.owner = owner;
        this.fee = fee;
        this.interest = interest;
    }
}
