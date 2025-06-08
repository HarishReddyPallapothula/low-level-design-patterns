package org.harry.creational_patterns.prototype_pattern;

public class ConfigService {
    public double fetchInterestRate(String loanType) {
        // Simulate slow config fetch
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        if (loanType.equals("home")) return 6.75;
        if (loanType.equals("car")) return 7.25;
        return 8.5;
    }
}

