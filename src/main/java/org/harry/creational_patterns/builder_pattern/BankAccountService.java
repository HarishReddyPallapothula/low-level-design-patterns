package org.harry.creational_patterns.builder_pattern;

public class BankAccountService {
    public BankAccount openAccount(String accountNumber, String accountHolderName, String type, String emailOrRate) {
        BankAccountBuilder builder = new StandardBankAccountBuilder();
        AccountDirector director = new AccountDirector(builder);

        switch (type.toUpperCase()) {
            case "SAVINGS":
                return director.constructSavingsAccount(accountNumber, accountHolderName, emailOrRate);
            case "CURRENT":
                return director.constructBusinessAccount(accountNumber, accountHolderName, emailOrRate);
            case "LOAN":
                double interestRate;
                try {
                    interestRate = Double.parseDouble(emailOrRate);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Loan account requires a valid interest rate.");
                }
                return director.constructLoanAccount(accountNumber, accountHolderName, interestRate);
            default:
                throw new IllegalArgumentException("Unsupported account type: " + type);
        }

    }
}

