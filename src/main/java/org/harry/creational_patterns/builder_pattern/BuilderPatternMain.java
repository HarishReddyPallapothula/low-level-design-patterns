package org.harry.creational_patterns.builder_pattern;
// Basically used to avoid constructor overloading.
// Builder pattern is powerful because it makes optional vs. required fields explicit.
// we can identify the builder pattern by private constructor which can be called by builder method only,
// and the builder is a static inner class but it willl not always be same
// here us a chance of using a director where there will be different builders
public class BuilderPatternMain {
    public static void builderPatternMain() {
        BankAccountService bankAccountService = new BankAccountService();
        System.out.println(bankAccountService.openAccount("HSR342526", "Harish", "SAVINGS","HARRY@GMAIL.COM"));
    }

}
