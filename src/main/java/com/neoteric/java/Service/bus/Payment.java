package com.neoteric.java.Service.bus;

import com.neoteric.java.model.Bus.Bus;
import com.neoteric.java.model.Bus.PassangerDetails;

public class Payment {
    public int paymentProcessing(PassangerDetails passangerDetails, Bus bus){

        int cost=passangerDetails.bus.speed*(bus.endtime- bus.starttime);
        int amount[]=new int[8];


        if(passangerDetails.bus.type.equals("AC+SUPER LUXURY")){
            amount[0]=(150+cost)*passangerDetails.noOfSeats;
            return amount[0];
        }
        else if (passangerDetails.bus.type.equals("Non-AC+SUPER LUXURY")) {
            amount[1]=(100+cost)*passangerDetails.noOfSeats;
            return amount[1];
        }
        else if (passangerDetails.bus.type.equals("AC sleeper+SUPER LUXURY")) {
            amount[2]=(250+cost)*passangerDetails.noOfSeats;
            return amount[2];
        }
        else if (passangerDetails.bus.type.equals("Non-AC sleeper+SUPER LUXURY")) {
            amount[3]=(200+cost)*passangerDetails.noOfSeats;
            return amount[3];
        }
        else if (passangerDetails.bus.type.equals("AC+RAJDHANI")) {
            amount[4]=(100+cost)*passangerDetails.noOfSeats;
            return amount[4];
        }
        else if (passangerDetails.bus.type.equals("Non-AC+RAJDHANI")) {
            amount[5]=(50+cost)*passangerDetails.noOfSeats;
            return amount[5];
        }
        else if (passangerDetails.bus.type.equals("AC sleeper+RAJDHANI")) {
            amount[6]=(150+cost)*passangerDetails.noOfSeats;
            return amount[6];
        } else {
            amount[7]=(130+cost)*passangerDetails.noOfSeats;
            return amount[7];
        }
    }
}
