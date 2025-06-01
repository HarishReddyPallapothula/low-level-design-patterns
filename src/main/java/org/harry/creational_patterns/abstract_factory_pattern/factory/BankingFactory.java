package org.harry.creational_patterns.abstract_factory_pattern.factory;

import org.harry.creational_patterns.abstract_factory_pattern.product.Account;
import org.harry.creational_patterns.abstract_factory_pattern.product.Loan;

public interface BankingFactory {
    Loan createLoan();
    Account createAccount();
}
