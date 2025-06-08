package org.harry.creational_patterns.singleton_pattern;

import org.harry.creational_patterns.singleton_pattern.service.FundTransferService;
import org.harry.creational_patterns.singleton_pattern.service.LoanDisbursementService;

public class SingletonPatternMain {
    public static void singletonPatternMain(){
        FundTransferService fundTransferService = new FundTransferService();
        fundTransferService.transfer("virat", "ABD", 60000);

        LoanDisbursementService loanDisbursementService = new LoanDisbursementService();
        loanDisbursementService.disburse("Vijay Mallya", 4739730);
    }
}
