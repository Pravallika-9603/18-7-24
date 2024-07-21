package com.neoteric.java.Service.loan;

import com.neoteric.java.model.loan.LoanApplication;

import java.util.UUID;

public class LoanApplicationService {
    public String loanProcessing(LoanApplication loanApplication){
        if(loanApplication.occupation.expenditure==loanApplication.occupation.sal){
            return "";
        }
        else {
            loanApplication.loanAppNo = UUID.randomUUID().toString();
            return loanApplication.loanAppNo;
        }
    }
}
