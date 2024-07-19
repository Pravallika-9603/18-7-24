package com.neoteric.java.loan.model.service;

import com.neoteric.java.loan.model.LoanApplication;

public class LoanApproval {
   public int loanAmount;
    public int savings;
    public int loanAmountApproval(LoanApplication loanApplication){
        savings=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
        loanAmount=savings*10;
        return loanAmount;
    }
}
