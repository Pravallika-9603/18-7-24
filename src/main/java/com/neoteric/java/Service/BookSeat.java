package com.neoteric.java.Service;

import com.neoteric.java.model.Bus;
import com.neoteric.java.model.PassangerDetails;
import com.neoteric.java.model.RouteClass;

import java.util.ArrayList;
import java.util.List;

public class BookSeat {
    List<String> seat=new ArrayList<>();
    PassangerDetails passangerDetails;
    RouteClass routeClass;

    public BookSeat(PassangerDetails passangerDetails,RouteClass routeClass) {
        int seatsInBus = 20;
        for (int i = 0; i < seatsInBus; i++) {
            this.seat.add("seat" + i);
        }
        this.passangerDetails = passangerDetails;
        this.routeClass = routeClass;
    }

    public int bookSeat(int seatNo){
        int cost=0;
        if(passangerDetails.age<4){
            System.out.println("No need");
        }
        else {
            if(seat.contains("seat"+seatNo)){
                String sNo="seat"+seatNo;
                Payment payment=new Payment();
                cost=payment.paymentProcessing(passangerDetails,routeClass);
                System.out.println("SNo done");
            }
        }
        return cost;
    }
}
