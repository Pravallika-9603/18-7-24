package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;
import com.neoteric.java.model.LoanReturns;

public class LoanApproval {
    public LoanReturns loanAmountApproval(LoanApplication loanApplication){
        LoanReturns loanReturns=new LoanReturns();
        loanReturns.savings=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
         loanReturns.loanamount=loanReturns.savings*10;
        return loanReturns;
    }
}
