package org.harry.creational_patterns.abstract_factory_pattern.product;

public class IndiaAccount implements Account{
    @Override
    public void createAccount(String accountHolder){
        System.out.println("Account was created in Indian Bank for "+ accountHolder);
    }
}
