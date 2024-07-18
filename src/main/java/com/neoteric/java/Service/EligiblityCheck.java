package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;

import java.util.UUID;

public class EligiblityCheck {
   public LoanApproval loanApproval;
  public String loanEligiblity(int months){
      int amount=loanApproval.loanAmount;
      int savings=loanApproval.amount;
      System.out.println(amount);
      System.out.println(savings);
     /* double a=0.6;
     double b=0.6*savings;
       double c=amount/months;
        if(b>=c){
            System.out.println("eliglible");
        }
        else{
            System.out.println("not eliglible");
        }*/

        return UUID.randomUUID().toString();
    }
}
