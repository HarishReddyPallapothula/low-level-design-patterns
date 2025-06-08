package org.harry.creational_patterns.prototype_pattern;

public class LoanProfile implements Cloneable {
    private String loanType;
    private double interestRate;
    private double amount;
    private ConfigService configService; // external resource

    public LoanProfile(String loanType, ConfigService configService) {
        this.loanType = loanType;
        this.configService = configService;
        this.interestRate = configService.fetchInterestRate(loanType);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public LoanProfile clone() {
        try {
            LoanProfile cloned = (LoanProfile) super.clone();
            // Share the same configService (safe: stateless)
            cloned.configService = this.configService;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }

    public void display() {
        System.out.println(loanType + " Loan: ₹" + amount + " @ " + interestRate + "%");
    }
}

