package cz.cvut.fel.omo.cv8.bank;

public class ClassicAccount extends Account{
    public ClassicAccount(String name, Currency currency, User owner, Long fee, Integer interest) {
        super(name, currency, owner, fee, interest);
    }
}
