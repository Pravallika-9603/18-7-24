package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;

public class LoanApproval {
    public int loanAmount;
    public int amount;
    public int loanAmountApproval(LoanApplication loanApplication){
        this.amount=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
         this.loanAmount=amount*10;
        return loanAmount;
    }
}
