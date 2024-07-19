package com.neoteric.java.Service;

import com.neoteric.java.model.PassangerDetails;
import com.neoteric.java.model.RouteClass;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    public int paymentProcessing(PassangerDetails passangerDetails,RouteClass routeClass){

        int cost=passangerDetails.bus.speed*(routeClass.endtime- routeClass.starttime)*10;
        int amount[]=new int[8];


        if(passangerDetails.bus.type.equals("AC+SUPER LUXURY")){
            amount[0]=150+cost;
            return amount[0];
        }
        else if (passangerDetails.bus.type.equals("Non-AC+SUPER LUXURY")) {
            amount[1]=100+cost;
            return amount[1];
        }
        else if (passangerDetails.bus.type.equals("AC sleeper+SUPER LUXURY")) {
            amount[2]=250+cost;
            return amount[2];
        }
        else if (passangerDetails.bus.type.equals("Non-AC sleeper+SUPER LUXURY")) {
            amount[3]=200+cost;
            return amount[3];
        }
        else if (passangerDetails.bus.type.equals("AC+RAJDHANI")) {
            amount[4]=100+cost;
            return amount[4];
        }
        else if (passangerDetails.bus.type.equals("Non-AC+RAJDHANI")) {
            amount[5]=50+cost;
            return amount[5];
        }
        else if (passangerDetails.bus.type.equals("AC sleeper+RAJDHANI")) {
            amount[6]=150+cost;
            return amount[6];
        } else {
            amount[7]=130+cost;
            return amount[7];
        }
    }
}
