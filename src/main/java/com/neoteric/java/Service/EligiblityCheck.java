package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;
import com.neoteric.java.model.LoanReturns;

import java.util.UUID;

public class EligiblityCheck {
  public String loanEligiblity(int months){
    //  LoanApproval loanApproval=new LoanApproval();
     double partOfSaving=0.6*loanReturns.savings;
      System.out.println(partOfSaving);
       double loanAmountPerMon=loanReturns.loanamount/months;
      System.out.println(loanAmountPerMon);
       if(partOfSaving>=loanAmountPerMon){
            System.out.println("eliglible");
        }
        else{
            System.out.println("not eliglible");
        }
        return UUID.randomUUID().toString();
    }
}
