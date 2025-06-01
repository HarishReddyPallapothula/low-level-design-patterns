package org.harry.creational_patterns.abstract_factory_pattern;

import org.harry.creational_patterns.abstract_factory_pattern.factory.BankingFactory;
import org.harry.creational_patterns.abstract_factory_pattern.product.Account;
import org.harry.creational_patterns.abstract_factory_pattern.product.Loan;
import org.harry.creational_patterns.abstract_factory_pattern.product.USAAccount;

//Abstract factory patter provides an interface for creating families of related or dependent objects without specifying their concrete classes.
// for example if you have a multi national bank which requires to have seperate account types and seperate loan types or each country.
// account and loans are dependent on each other
// which type of factory or loan or account is created is getting modified based on the input.
// the client 'AbstractFactoryPatternMain' banking factory doesn't know any of these things it just uses createLoan and create account.
// basically client doesnt know ype of the combination of objects, You choose the factory, and it gives you the right combination of parts.

public class AbstractFactoryPatternMain {
    public static void implAFP(){
        BankingFactory indiaFactory = BankingFactoryProvider.getFactory("india");

        Loan indiaLoan = indiaFactory.createLoan();
        Account indiaAccount = indiaFactory.createAccount();

        BankingFactory usaFactory = BankingFactoryProvider.getFactory("usa");

        Loan usLoan = usaFactory.createLoan();
        Account usAccount = usaFactory.createAccount();
        indiaLoan.issueLoan(50000);
        indiaAccount.createAccount("Virat");

        usLoan.issueLoan(4000);
        usAccount.createAccount("IMF");
    }
}
