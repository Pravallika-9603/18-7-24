package com.neoteric.java.Service;

import com.neoteric.java.model.PassangerDetails;
import com.neoteric.java.model.Ticket;

import static java.lang.System.exit;

public class PaymentMethod {
    PassangerDetails passangerDetails;
    public PaymentMethod(PassangerDetails passangerDetails){
        this.passangerDetails=passangerDetails;
    }
    public void processingPayment(int amount,String mode){
        System.out.println(mode);
        Ticket ticket=new Ticket();
        if(mode=="debitcard" || mode=="Credit card"){
            System.out.println("Payment sucess");
            ticket.seatNo=passangerDetails.bus.seatNo;
            ticket.fromloc=passangerDetails.fromCity;
            ticket.toloc=passangerDetails.toCity;
            ticket.departDate=passangerDetails.departDate;
        }
        else {
            exit(0);
            System.out.println("Payment need to be done");
        }
        passangerDetails.bus.ticket=ticket;
        System.out.println(passangerDetails.bus.ticket);
    }
}
