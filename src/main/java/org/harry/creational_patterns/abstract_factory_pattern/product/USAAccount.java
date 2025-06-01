package org.harry.creational_patterns.abstract_factory_pattern.product;

public class USAAccount implements Account{
    @Override
    public void createAccount(String accountHolder) {
        System.out.println("Account was created in USA");
    }
}
