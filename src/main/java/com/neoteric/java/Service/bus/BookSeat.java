package com.neoteric.java.Service.bus;

import com.neoteric.java.model.Bus.Bus;
import com.neoteric.java.model.Bus.PassangerDetails;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BookSeat {
    List<String> seat=new ArrayList<>();
    public PassangerDetails passangerDetails;
    public  Bus bus;
    public BookSeat(PassangerDetails passangerDetails,Bus bus) {
        int seatsInBus = 20;
        for (int i = 0; i < seatsInBus; i++) {
            this.seat.add("seat" + i);
        }
        this.passangerDetails = passangerDetails;
        this.bus=bus;
    }

    public int bookSeat(int[] arr){
        int cost=0;
        if(passangerDetails.age<4){
            System.out.println("No need");
        }
        else {
            for(int i=0;i<arr.length;i++){
                if(seat.contains("seat"+arr[i])){
                    String sNo="seat"+arr[i];
                    passangerDetails.arr[i]=arr[i];
                }
            }
            Payment payment=new Payment();
            cost=payment.paymentProcessing(passangerDetails,bus);
            System.out.print("These seats will be booked after payment:");
            for(int i=0;i<arr.length;i++){
                System.out.print("  "+arr[i]);
            }
        }
        return cost;
    }
}
