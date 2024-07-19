package com.neoteric.java;

import com.neoteric.java.Service.BookSeat;
import com.neoteric.java.Service.CheckAvailability;
import com.neoteric.java.Service.PaymentMethod;
import com.neoteric.java.model.Bus;
import com.neoteric.java.model.PassangerDetails;
import com.neoteric.java.model.RouteClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BusTest {
    @Test
    public void test(){
        PassangerDetails passangerDetails=new PassangerDetails();
        passangerDetails.name="Churi";
        passangerDetails.age=21;
        passangerDetails.fromCity="Hyd";
        passangerDetails.toCity="Vij";


        //list of buses to be displayed
        RouteClass routeClass=new RouteClass();
        routeClass.fromLoc=passangerDetails.fromCity;
        routeClass.toLoc=passangerDetails.toCity;
        routeClass.fromDate=passangerDetails.departDate;
        routeClass.serviceNo= UUID.randomUUID().toString();

        //list of bustypes
        List<String> type = new ArrayList<>();
        type.add("AC+SUPER LUXURY");
        type.add("Non-AC+SUPER LUXURY");
        type.add("AC sleeper+SUPER LUXURY");
        type.add("Non-AC sleeper+SUPER LUXURY");
        type.add("AC+RAJDHANI");
        type.add("Non-AC+RAJDHANI");
        type.add("AC sleeper+RAJDHANI");
        type.add("Non-AC sleeper+RAJDHANI");
        //routeClass.type=type;
       //----------- routeClass.cost=500;
        //Bus
        Bus bus=new Bus();
        bus.type=type;
        bus.serviceNo= routeClass.serviceNo;
        //----------bus.seatNo

        passangerDetails.bus=bus;
        CheckAvailability checkAvailability=new CheckAvailability(bus);
        List<RouteClass> listOfBusRoute=checkAvailability.check(passangerDetails);
        Assertions.assertNotNull(listOfBusRoute);

        BookSeat bookSeat=new BookSeat(passangerDetails,routeClass);
        int amount= bookSeat.bookSeat(10);


       // passangerDetails.mode="debitcard";

        PaymentMethod paymentMethod =new PaymentMethod(passangerDetails);
        paymentMethod.processingPayment(amount,"debitcard");

        Assertions.assertNotNull(passangerDetails.bus.ticket);
    }
}



