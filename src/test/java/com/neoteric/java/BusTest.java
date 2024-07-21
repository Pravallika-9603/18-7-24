package com.neoteric.java;

import com.neoteric.java.Service.bus.BookSeat;
import com.neoteric.java.Service.bus.CheckAvailability;
import com.neoteric.java.Service.bus.PaymentMethod;
import com.neoteric.java.model.Bus.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BusTest {

    @Test
    public void test(){

        SearchDetails searchDetails=new SearchDetails();
        searchDetails.fromCity="Hyd";
        searchDetails.toCity="Vij";

        CheckAvailability checkAvailability=new CheckAvailability();
        List<RouteClass> listOfBusRoute=checkAvailability.check(searchDetails);


        Assertions.assertNotNull(listOfBusRoute);
        Assertions.assertEquals(2,listOfBusRoute.size());


        Bus bus=new Bus();
        bus.endtime=9;
        bus.starttime=6;
        bus.type="Non-AC+SUPER LUXURY";


        PassangerDetails passangerDetails=new PassangerDetails();
        passangerDetails.name="Churi";
        passangerDetails.age=21;
        passangerDetails.bus=bus;
        passangerDetails.boardingPoint="Hyd";
        passangerDetails.droppingPoint="Vij";


        BookSeat bookSeat=new BookSeat(passangerDetails);
        int cost= bookSeat.bookSeat(10,bus);

        Assertions.assertNotNull(cost);
        Assertions.assertEquals(340,cost);

        Ticket ticket=new Ticket();
        PaymentMethod paymentMethod =new PaymentMethod(passangerDetails);
        ticket=paymentMethod.processingPayment(cost,"debitcard");

        Assertions.assertNotNull(ticket);

    }
}



