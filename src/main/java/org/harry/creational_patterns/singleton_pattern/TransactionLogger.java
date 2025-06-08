package org.harry.creational_patterns.singleton_pattern;

public class TransactionLogger {

    // Private constructor
    private TransactionLogger() {
        System.out.println("Logger initialized...");
    }

    // Inner static class - loaded only when needed
    private static class LoggerHelper {
        private static final TransactionLogger INSTANCE = new TransactionLogger();
    }

    // Global access method
    public static TransactionLogger getInstance() {
        return LoggerHelper.INSTANCE;
    }

    // Example method
    public void log(String message) {
        System.out.println("[Audit Log]: " + message);
    }
}

