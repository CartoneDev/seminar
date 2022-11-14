package cz.cvut.fel.omo.bank.ab;

import cz.cvut.fel.omo.bank.AbstractBankFactory;
import cz.cvut.fel.omo.bank.Account;
import cz.cvut.fel.omo.bank.BankOffice;
import cz.cvut.fel.omo.bank.Loan;

import javax.money.MonetaryAmount;

/**
 * Kurz A7B36OMO - Objektove modelovani - Cviceni 7 Abstract factory, factory method, singleton, dependency injection
 *
 * @author mayerto1
 */
// TODO pouzijte anotaci @Named("Uni") pro pouziti Spring dependency injection
public class AbBankFactory extends AbstractBankFactory {
    private static AbstractBankFactory instance = null;
    private AbBankFactory() {

    }

    @Override
    public BankOffice createBankOffice() {
        return new AbBankOffice();
    }

    @Override
    public Account createAccount() {
        return new AbAccount();
    }

    @Override
    public Loan createLoan(MonetaryAmount amount, int months, double recommendedInterestRate) {
        return new AbLoan(amount, months, recommendedInterestRate);
    }

    public static AbstractBankFactory getInstance() {
        if (instance == null) {
            instance = new AbBankFactory();
        }
        return instance;
    }

    // TODO - implementujte metodu getInstance pro zajisteni vzoru Singleton

}
