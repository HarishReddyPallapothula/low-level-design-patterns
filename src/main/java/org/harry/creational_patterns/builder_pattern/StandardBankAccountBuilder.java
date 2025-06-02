package org.harry.creational_patterns.builder_pattern;

public class StandardBankAccountBuilder implements BankAccountBuilder {

    private BankAccount account;

    public StandardBankAccountBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.account = new BankAccount();
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        account.setAccountNumber(accountNumber);
    }

    @Override
    public void setAccountHolderName(String name) {
        account.setAccountHolderName(name);
    }

    @Override
    public void setEmail(String email) {
        account.setEmail(email);
    }

    @Override
    public void setPhoneNumber(String phone) {
        account.setPhoneNumber(phone);
    }

    @Override
    public void setAddress(String address) {
        account.setAddress(address);
    }

    @Override
    public void setAccountType(String type) {
        account.setAccountType(type);
    }

    @Override
    public void setInterestRate(double rate) {
        account.setInterestRate(rate);
    }

    @Override
    public void setNotificationsEnabled(boolean enabled) {
        account.setNotificationsEnabled(enabled);
    }

    @Override
    public BankAccount build() {
        BankAccount result = this.account;
        this.reset(); // builder can be reused
        return result;
    }
}
