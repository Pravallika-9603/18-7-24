package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;

public class LoanApproval {
    public int loanAmountApproval(LoanApplication loanApplication){
        System.out.println(loanApplication.occupation.sal);
        System.out.println(loanApplication.occupation.expenditure);
        int amount=loanApplication.occupation.sal-loanApplication.occupation.expenditure;
        return amount*10;
    }
}
