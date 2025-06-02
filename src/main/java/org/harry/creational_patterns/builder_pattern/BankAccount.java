package org.harry.creational_patterns.builder_pattern;

public class BankAccount {
    // Mandatory fields
    private final String accountNumber;
    private final String accountHolderName;

    // Optional fields
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final String accountType;
    private final double interestRate;
    private final boolean notificationsEnabled;

    // Private constructor — only Builder can call it
    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.accountHolderName = builder.accountHolderName;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.accountType = builder.accountType;
        this.interestRate = builder.interestRate;
        this.notificationsEnabled = builder.notificationsEnabled;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
    public String getAccountType() { return accountType; }
    public double getInterestRate() { return interestRate; }
    public boolean isNotificationsEnabled() { return notificationsEnabled; }

    public static class Builder {
        private final String accountNumber;
        private final String accountHolderName;

        private String email;
        private String phoneNumber;
        private String address;
        private String accountType;
        private double interestRate;
        private boolean notificationsEnabled;

        public Builder(String accountNumber, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder interestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder notificationsEnabled(boolean enabled) {
            this.notificationsEnabled = enabled;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}

