package com.neoteric.java.Service.bus;

import com.neoteric.java.model.Bus.PassangerDetails;
import com.neoteric.java.model.Bus.Ticket;

import static java.lang.System.exit;

public class PaymentMethod {
    PassangerDetails passangerDetails;
    public PaymentMethod(PassangerDetails passangerDetails){
        this.passangerDetails=passangerDetails;
    }
    public Ticket processingPayment(int amount,String mode){

        Ticket ticket=new Ticket();
        if(mode=="debitcard" || mode=="Credit card"){
            System.out.println("Payment sucess");
            ticket.seatNo=passangerDetails.bus.seatNo;
            ticket.fromloc=passangerDetails.boardingPoint;
            ticket.toloc=passangerDetails.droppingPoint;
        }
        else {
            exit(0);
            System.out.println("Payment need to be done");
        }
        passangerDetails.bus.ticket=ticket;
        return passangerDetails.bus.ticket;
    }
}
