package com.neoteric.java.Service;

import com.neoteric.java.model.LoanApplication;

import java.util.UUID;

public class EligiblityCheck {
    public String loanEligiblity(int loanAmount,int months){
        double a=0.6;
      double b=0.6*loanAmount;
       double c=loanAmount*10/months;
        if(b>=c){
            System.out.println("eliglible");
        }
        else{
            System.out.println("not eliglible");
        }
        return UUID.randomUUID().toString();
    }
}
