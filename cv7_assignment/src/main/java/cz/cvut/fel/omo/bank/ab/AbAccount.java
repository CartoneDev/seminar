package cz.cvut.fel.omo.bank.ab;

import cz.cvut.fel.omo.bank.Account;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;

/**
 * Kurz A7B36OMO - Objektove modelovani - Cviceni 7 Abstract factory, factory method, singleton, dependency injection
 *
 * @author mayerto1
 */
public class AbAccount implements Account {

    private final static int FIXED_FEE = 100;

    private MonetaryAmount balance = Money.of(0, "EUR");

    @Override
    public MonetaryAmount getBalance() {
        return balance;
    }

    @Override
    public MonetaryAmount getWithdrawLimit() {
        return Money.of(2000, "EUR");
    }

    @Override
    public MonetaryAmount getMonthlyFee() {
        return Money.of(FIXED_FEE, "EUR");
    }

    @Override
    public void withdraw(MonetaryAmount amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public void deposit(MonetaryAmount amount) {
        balance = balance.add(amount);
    }

    public String toString() {
        return String.format("Uni Account - balance: %s, fee: %s", getBalance(), getMonthlyFee());
    }
}
