package org.harry.creational_patterns.prototype_pattern;

public class PrototypePatternMain {
    public static void prototypePatternMain() {
        ConfigService configService = new ConfigService();
        LoanRegistry registry = new LoanRegistry(configService);

        LoanProfile customer1 = registry.getLoan("home");
        customer1.setAmount(50_00_000);
        customer1.display();

        LoanProfile customer2 = registry.getLoan("home");
        customer2.setAmount(65_00_000);
        customer2.display();

        LoanProfile customer3 = registry.getLoan("car");
        customer3.setAmount(10_00_000);
        customer3.display();
    }
}
