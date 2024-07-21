package com.neoteric.java.Service.bus;

import com.neoteric.java.model.Bus.RouteClass;
import com.neoteric.java.model.Bus.SearchDetails;
import java.util.ArrayList;
import java.util.List;

public class CheckAvailability {
    public List<RouteClass> listOfAvailableBuses= new ArrayList<>();;
    public CheckAvailability() {

        RouteClass routeClass = new RouteClass();
        routeClass.fromLoc = "Hyd";
        routeClass.toLoc = "Vij";
        routeClass.serviceNo = "9876";
        routeClass.type = "AC+SUPER LUXURY";
        listOfAvailableBuses.add(routeClass);

        RouteClass routeClass1 = new RouteClass();
        routeClass1.fromLoc = "Hyd";
        routeClass1.toLoc = "Amalapuram";
        routeClass1.serviceNo = "9876";
        routeClass1.type = "AC+SUPER LUXURY";
        listOfAvailableBuses.add(routeClass1);

        RouteClass routeClass2 = new RouteClass();
        routeClass2.fromLoc = "Hyd";
        routeClass2.toLoc = "Rajamendry";
        routeClass2.serviceNo = "9876";
        routeClass2.type = "AC+SUPER LUXURY";
        listOfAvailableBuses.add(routeClass2);

        RouteClass routeClass3 = new RouteClass();
        routeClass3.fromLoc = "Hyd";
        routeClass3.toLoc = "Vij";
        routeClass3.serviceNo = "9876";
        routeClass3.type = "Non-AC+SUPER LUXURY";
        listOfAvailableBuses.add(routeClass3);

        RouteClass routeClass4 = new RouteClass();
        routeClass4.fromLoc = "Hyd";
        routeClass4.toLoc = "Amalapuram";
        routeClass4.serviceNo = "9876";
        routeClass4.type = "Non-AC+SUPER LUXURY";
        listOfAvailableBuses.add(routeClass4);
    }

   public List<RouteClass> check(SearchDetails searchDetails) {
       List<RouteClass> passangerDisplayBuslist = new ArrayList<>();
        for(int i=0;i<listOfAvailableBuses.size();i++){
            if(listOfAvailableBuses.get(i).fromLoc.equals(searchDetails.fromCity) && listOfAvailableBuses.get(i).toLoc.equals(searchDetails.toCity)){
                passangerDisplayBuslist.add(listOfAvailableBuses.get(i));
            }
        }
        return passangerDisplayBuslist;
   }

}
