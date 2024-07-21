package com.neoteric.java.Service.loan;

import com.neoteric.java.model.loan.LoanApplication;

public class LoanApproval {
   public int loanAmount;
    public int savings;
    public int loanAmountApproval(LoanApplication loanApplication){
        savings=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
        loanAmount=savings*10;
        return loanAmount;
    }
}
