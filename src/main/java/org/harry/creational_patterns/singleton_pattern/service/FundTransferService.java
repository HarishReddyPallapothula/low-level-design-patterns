package org.harry.creational_patterns.singleton_pattern.service;

import org.harry.creational_patterns.singleton_pattern.TransactionLogger;

public class FundTransferService {
    public void transfer(String fromAccount, String toAccount, double amount) {
        // Business logic
        TransactionLogger logger = TransactionLogger.getInstance();
        logger.log("Transferred ₹" + amount + " from " + fromAccount + " to " + toAccount);
    }
}

