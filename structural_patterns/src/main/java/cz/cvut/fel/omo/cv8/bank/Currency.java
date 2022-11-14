package cz.cvut.fel.omo.cv8.bank;

public class Currency extends Account {
    private final String code;
    private final String name;

    public Currency(String name, Currency currency, User owner, Long fee, Integer interest, String code, String name1) {
        super(name, currency, owner, fee, interest);
        this.code = code;
        this.name = name1;
    }
}
