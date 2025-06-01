package org.harry.creational_patterns.abstract_factory_pattern.product;

public class IndiaLoan implements Loan{
    @Override
    public void issueLoan(int amount) {
        System.out.println("Loan amount issue India : "+ amount);
    }
}
