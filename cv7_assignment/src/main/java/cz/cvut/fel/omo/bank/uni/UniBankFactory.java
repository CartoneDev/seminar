package cz.cvut.fel.omo.bank.uni;

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
public class UniBankFactory extends AbstractBankFactory {

    private static UniBankFactory instance = null;

    @Override
    public BankOffice createBankOffice() {
        return new UniBankOffice();
    }

    @Override
    public Account createAccount() {
        return new UniAccount();
    }

    @Override
    public Loan createLoan(MonetaryAmount amount, int months, double recommendedInterestRate) {
        return new UniLoan(amount, months, recommendedInterestRate);
    }

    // TODO - implementujte metodu getInstance pro zajisteni vzoru Singleton

}
