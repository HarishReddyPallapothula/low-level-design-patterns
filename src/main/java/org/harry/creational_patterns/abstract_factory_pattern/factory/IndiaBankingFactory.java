package org.harry.creational_patterns.abstract_factory_pattern.factory;

import org.harry.creational_patterns.abstract_factory_pattern.product.Account;
import org.harry.creational_patterns.abstract_factory_pattern.product.IndiaAccount;
import org.harry.creational_patterns.abstract_factory_pattern.product.IndiaLoan;
import org.harry.creational_patterns.abstract_factory_pattern.product.Loan;

public class IndiaBankingFactory implements BankingFactory {

    public Loan createLoan() {
        return new IndiaLoan();
    }

    public Account createAccount() {
        return new IndiaAccount();
    }
}
