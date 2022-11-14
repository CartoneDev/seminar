package cz.cvut.fel.omo.cv8.bank;

public class SavingsAccount extends Account {
    public SavingsAccount(String name, Currency currency, User owner, Long fee, Integer interest) {
        super(name, currency, owner, fee, interest);
    }
}
