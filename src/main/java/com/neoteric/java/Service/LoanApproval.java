package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;

public class LoanApproval {
   public int loanAmount;
    public int amount;
    public int loanAmountApproval(LoanApplication loanApplication){
        amount=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
        loanAmount=amount*10;
        return loanAmount;
    }
}
