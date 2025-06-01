package org.harry.creational_patterns.abstract_factory_pattern;

import org.harry.creational_patterns.abstract_factory_pattern.factory.BankingFactory;
import org.harry.creational_patterns.abstract_factory_pattern.factory.IndiaBankingFactory;
import org.harry.creational_patterns.abstract_factory_pattern.factory.USABankingFactory;

public class BankingFactoryProvider {
    public static BankingFactory getFactory(String country) {
        switch (country.toLowerCase()) {
            case "usa":
                return new USABankingFactory();
            case "india":
                return new IndiaBankingFactory();
            default:
                throw new IllegalArgumentException("Unsupported country: " + country);
        }
    }
}

