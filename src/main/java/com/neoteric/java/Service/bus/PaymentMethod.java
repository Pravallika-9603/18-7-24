package com.neoteric.java.Service.bus;

import com.neoteric.java.model.Bus.PassangerDetails;
import com.neoteric.java.model.Bus.Ticket;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class PaymentMethod {
    PassangerDetails passangerDetails;
    public PaymentMethod(PassangerDetails passangerDetails){
        this.passangerDetails=passangerDetails;
    }
    public List<Ticket> processingPayment(int amount,String mode){
        Ticket ticket1=new Ticket();
        List<Ticket> ticket=new ArrayList<>();
        if(mode=="debitcard" || mode=="Credit card"){
            System.out.println("Payment sucess");
            System.out.println("Ur seats are booked");

            for(int i=0;i<passangerDetails.noOfSeats;i++){
                ticket1.seatNo="seat "+passangerDetails.arr[i];
                ticket1.fromloc=passangerDetails.boardingPoint;
                ticket1.toloc=passangerDetails.droppingPoint;
                ticket.add(ticket1);
            }
        }
        else {
            exit(0);
            System.out.println("Payment need to be done");
        }
        passangerDetails.bus.ticket=ticket;
        return passangerDetails.bus.ticket;
    }
}
