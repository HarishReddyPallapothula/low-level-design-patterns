package org.harry.creational_patterns.builder_pattern;

public class AccountDirector {
    private BankAccountBuilder builder;

    public AccountDirector(BankAccountBuilder builder) {
        this.builder = builder;
    }

    public BankAccount constructSavingsAccount(String number, String name, String email) {
        builder.reset();
        builder.setAccountNumber(number);
        builder.setAccountHolderName(name);
        builder.setEmail(email);
        builder.setAccountType("SAVINGS");
        builder.setInterestRate(3.5);
        builder.setNotificationsEnabled(true);
        return builder.build();
    }

    public BankAccount constructBusinessAccount(String number, String name, String email) {
        builder.reset();
        builder.setAccountNumber(number);
        builder.setAccountHolderName(name);
        builder.setEmail(email);
        builder.setAccountType("CURRENT");
        builder.setInterestRate(0.0);
        builder.setNotificationsEnabled(true);
        return builder.build();
    }

    public BankAccount constructLoanAccount(String number, String name, double interestRate) {
        builder.reset();
        builder.setAccountNumber(number);
        builder.setAccountHolderName(name);
        builder.setAccountType("LOAN");
        builder.setInterestRate(interestRate);
        builder.setNotificationsEnabled(false);
        return builder.build();
    }
}

