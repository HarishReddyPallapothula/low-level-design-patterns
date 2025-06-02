package org.harry.creational_patterns.builder_pattern;

public class BankAccountService {
    public void openAccount(String accountNumber, String accountHolderName) {
        // didn't add other parameters as Im lazy just imagine it coming from controller or any other place
        BankAccount account = new BankAccount.Builder(accountNumber, accountHolderName)
                .email("hari.rdy@gmail.com")
                .phoneNumber("1234567890")
                .accountType("SAVINGS")
                .interestRate(3.5)
                .notificationsEnabled(true)
                .build();

        System.out.println("Account created for: " + account.getAccountHolderName() + " in Builder pattern");
    }
}

