package com.neoteric.java.loan.model.service;

import com.neoteric.java.loan.model.LoanApplication;

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
