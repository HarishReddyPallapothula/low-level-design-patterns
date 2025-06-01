package org.harry.creational_patterns.abstract_factory_pattern.factory;

import org.harry.creational_patterns.abstract_factory_pattern.product.Account;
import org.harry.creational_patterns.abstract_factory_pattern.product.Loan;
import org.harry.creational_patterns.abstract_factory_pattern.product.USAAccount;
import org.harry.creational_patterns.abstract_factory_pattern.product.USALoan;

public class USABankingFactory implements BankingFactory {
    public Loan createLoan() {
        return new USALoan();
    }

    public Account createAccount() {
        return new USAAccount();
    }
}
