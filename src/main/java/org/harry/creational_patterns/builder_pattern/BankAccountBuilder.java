package org.harry.creational_patterns.builder_pattern;

public interface BankAccountBuilder {
    void reset();  // optional
    void setAccountNumber(String accountNumber);
    void setAccountHolderName(String name);
    void setEmail(String email);
    void setPhoneNumber(String phone);
    void setAddress(String address);
    void setAccountType(String type);
    void setInterestRate(double rate);
    void setNotificationsEnabled(boolean enabled);
    BankAccount build();
}

