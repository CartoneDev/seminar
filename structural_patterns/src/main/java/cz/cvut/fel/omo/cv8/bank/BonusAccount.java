package cz.cvut.fel.omo.cv8.bank;

public class BonusAccount extends Account {

    public BonusAccount(String name, Currency currency, User owner, Long fee, Integer interest) {
        super(name, currency, owner, fee, interest);
    }
}
