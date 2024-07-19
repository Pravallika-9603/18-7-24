package com.neoteric.java.Service;

import com.neoteric.java.model.Bus;
import com.neoteric.java.model.PassangerDetails;
import com.neoteric.java.model.RouteClass;

import java.util.ArrayList;
import java.util.List;

public class CheckAvailability {
    public Bus bus;
    public CheckAvailability(Bus bus){
        this.bus=bus;
    }
    public List<RouteClass> check(PassangerDetails passangerDetails){
        List<RouteClass> listbuses=new ArrayList<>();

        RouteClass routeClass=new RouteClass();
        routeClass.fromLoc=passangerDetails.fromCity;
        routeClass.toLoc=passangerDetails.toCity;
        routeClass.fromDate=passangerDetails.departDate;
        routeClass.serviceNo="9876";
        routeClass.type="AC+SUPER LUXURY";
        listbuses.add(routeClass);

        RouteClass routeClass1=new RouteClass();
        routeClass1.fromLoc=passangerDetails.fromCity;
        routeClass1.toLoc=passangerDetails.toCity;
        routeClass1.fromDate=passangerDetails.departDate;
        routeClass1.serviceNo= "6789";
        routeClass1.type="Non-AC+SUPER LUXURY";
        listbuses.add(routeClass1);

        RouteClass routeClass2=new RouteClass();
        routeClass2.fromLoc=passangerDetails.fromCity;
        routeClass2.toLoc=passangerDetails.toCity;
        routeClass2.fromDate=passangerDetails.departDate;
        routeClass2.serviceNo= "5476";
        routeClass2.type="AC sleeper+SUPER LUXURY";
        listbuses.add(routeClass2);

        RouteClass routeClass3=new RouteClass();
        routeClass3.fromLoc=passangerDetails.fromCity;
        routeClass3.toLoc=passangerDetails.toCity;
        routeClass3.fromDate=passangerDetails.departDate;
        routeClass3.serviceNo= "4678";
        routeClass3.type="Non-AC sleeper+SUPER LUXURY";
        listbuses.add(routeClass3);

        RouteClass routeClass4=new RouteClass();
        routeClass.fromLoc=passangerDetails.fromCity;
        routeClass.toLoc=passangerDetails.toCity;
        routeClass.fromDate=passangerDetails.departDate;
        routeClass.serviceNo="6589";
        routeClass.type="AC+RAJDHANI";
        listbuses.add(routeClass);

        RouteClass routeClass5=new RouteClass();
        routeClass.fromLoc=passangerDetails.fromCity;
        routeClass.toLoc=passangerDetails.toCity;
        routeClass.fromDate=passangerDetails.departDate;
        routeClass.serviceNo="6389";
        routeClass.type="Non-AC+RAJDHANI";
        listbuses.add(routeClass);

        RouteClass routeClass6=new RouteClass();
        routeClass.fromLoc=passangerDetails.fromCity;
        routeClass.toLoc=passangerDetails.toCity;
        routeClass.fromDate=passangerDetails.departDate;
        routeClass.serviceNo="7854";
        routeClass.type="AC sleeper+RAJDHANI";
        listbuses.add(routeClass);

        RouteClass routeClass7=new RouteClass();
        routeClass.fromLoc=passangerDetails.fromCity;
        routeClass.toLoc=passangerDetails.toCity;
        routeClass.fromDate=passangerDetails.departDate;
        routeClass.serviceNo="4347";
        routeClass.type="Non-AC sleeper+RAJDHANI";
        listbuses.add(routeClass);


        return listbuses;
    }
}
