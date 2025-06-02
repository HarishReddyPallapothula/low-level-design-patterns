package org.harry.creational_patterns.builder_pattern;
// Basically used to avoid constructor overloading.
// Builder pattern is powerful because it makes optional vs. required fields explicit.
// we can identify the builder pattern by private constructor which can be called by builder method only,
// and the builder is a static inner class.
public class BuilderPatternMain {
    public static void builderPatternMain() {
        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.openAccount("46446777996", "Harry");
    }

}
