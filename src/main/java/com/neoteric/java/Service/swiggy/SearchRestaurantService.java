package com.neoteric.java.Service.swiggy;

import com.neoteric.java.model.swiggy.Available;
import com.neoteric.java.model.swiggy.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class SearchRestaurantService {
    public Available available;
    public SearchRestaurantService(Available available){
        this.available=available;
    }

    public List<Restaurant> search(String restaurant){
        List<Restaurant> userDisplayRestaurants=new ArrayList<>();
        for(int i=0;i<available.availableRestaurant.size();i++){
            if(available.availableRestaurant.get(i).restaurantName.equals(restaurant)){
                userDisplayRestaurants.add(available.availableRestaurant.get(i));
            }
        }
        return userDisplayRestaurants;
    }
}
