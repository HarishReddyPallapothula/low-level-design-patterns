package org.harry.creational_patterns.abstract_factory_pattern.product;

public class USALoan implements Loan{
    @Override
    public void issueLoan(int amount) {
        System.out.println("Loan amount issued in USA was : "+amount);
    }
}
