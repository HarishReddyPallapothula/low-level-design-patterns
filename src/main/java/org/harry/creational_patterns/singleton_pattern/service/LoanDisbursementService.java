package org.harry.creational_patterns.singleton_pattern.service;

import org.harry.creational_patterns.singleton_pattern.TransactionLogger;

public class LoanDisbursementService {
    public void disburse(String account, double amount) {
        TransactionLogger logger = TransactionLogger.getInstance();
        logger.log("Disbursed ₹" + amount + " to account " + account);
    }
}
