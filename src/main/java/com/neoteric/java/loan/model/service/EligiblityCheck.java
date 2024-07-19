package com.neoteric.java.loan.model.service;

import java.util.UUID;

public class EligiblityCheck {
   public LoanApproval loanApproval;
    public EligiblityCheck(LoanApproval loanApproval){
        this.loanApproval=loanApproval;
    }
  public String loanEligiblity(int months){
     double partOfSaving=0.6*loanApproval.savings;
       double amountPerMon=loanApproval.loanAmount/months;
        if(partOfSaving>=amountPerMon){
            System.out.println("eliglible");
        }
        else{
            System.out.println("not eliglible");
        }
        return UUID.randomUUID().toString();
    }
}
