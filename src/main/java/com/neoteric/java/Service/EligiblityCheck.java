package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;

import java.util.UUID;

public class EligiblityCheck {
   public LoanApproval loanApproval;
    public EligiblityCheck(LoanApproval loanApproval){
        this.loanApproval=loanApproval;
    }
  public String loanEligiblity(int months){
      //System.out.println(loanApproval.loanAmount);
     double partOfSaving=0.6*loanApproval.amount;
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
