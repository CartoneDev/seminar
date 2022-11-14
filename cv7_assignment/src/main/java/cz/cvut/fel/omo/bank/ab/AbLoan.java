package cz.cvut.fel.omo.bank.ab;

import cz.cvut.fel.omo.bank.Loan;

import javax.money.MonetaryAmount;

/**
 * Kurz A7B36OMO - Objektove modelovani - Cviceni 7 Abstract factory, factory method, singleton, dependency injection
 *
 * @author mayerto1
 */
public class AbLoan implements Loan {

    private MonetaryAmount balance;
    private final double interestRate;
    private final int repaymentPeriod;

    public AbLoan(MonetaryAmount amount, int months, double recommendedInterestRate) {
        balance = amount;
        interestRate = recommendedInterestRate;
        repaymentPeriod = months;
    }

    @Override
    public MonetaryAmount getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public MonetaryAmount getMonthlyPayment() {
        return balance = balance.divide(repaymentPeriod)
                                .add(balance.multiply(interestRate / 12));
    }

    public String toString() {
        return String.format("Loan Overview - Balance: %s, InterestRate: %f, MonthlyPayment: %s", getBalance(), getInterestRate(), getMonthlyPayment());
    }

}
