package org.harry.creational_patterns.builder_pattern;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String email;
    private String phoneNumber;
    private String address;
    private String accountType;
    private double interestRate;
    private boolean notificationsEnabled;

    // Setters for builder use
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setNotificationsEnabled(boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    @Override
    public String toString() {
        return String.format("Account[%s, %s, %s, %s, %.2f%%]",
                accountType, accountNumber, accountHolderName, email, interestRate);
    }
}


