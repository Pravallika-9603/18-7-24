package com.neoteric.java.Service.bus;

import com.neoteric.java.model.Bus.Bus;
import com.neoteric.java.model.Bus.PassangerDetails;
import java.util.ArrayList;
import java.util.List;

public class BookSeat {
    List<String> seat=new ArrayList<>();
    PassangerDetails passangerDetails;

    public BookSeat(PassangerDetails passangerDetails) {
        int seatsInBus = 20;
        for (int i = 0; i < seatsInBus; i++) {
            this.seat.add("seat" + i);
        }
        this.passangerDetails = passangerDetails;
    }

    public int bookSeat(int seatNo,Bus bus){
        int cost=0;
        if(passangerDetails.age<4){
            System.out.println("No need");
        }
        else {
            if(seat.contains("seat"+seatNo)){
                String sNo="seat"+seatNo;
                Payment payment=new Payment();
                cost=payment.paymentProcessing(passangerDetails,bus);
                System.out.println("seat"+seatNo);
            }
        }
        return cost;
    }
}
