package com.neoteric.java.Service;

import com.neoteric.java.model.Customer;
import com.neoteric.java.model.LoanApplication;

import java.util.UUID;

public class LoanApplicationService {
    public String loanProcessing(LoanApplication loanApplication){
        return UUID.randomUUID().toString();
    }
}
