package com.neoteric.java;

import com.neoteric.java.Service.swiggy.OTPValidation;
import com.neoteric.java.Service.swiggy.LoginService;
import com.neoteric.java.Service.swiggy.SearchRestaurantService;
import com.neoteric.java.model.swiggy.Available;
import com.neoteric.java.model.swiggy.CustomerDetails;
import com.neoteric.java.model.swiggy.Restaurant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SwiggyTest {
    @Test
    public void Test(){
        CustomerDetails customerDetails=new CustomerDetails();
        customerDetails.phnno="9553048885";
        customerDetails.otp="1245";

        Available available=new Available();
        List<Restaurant> availableRestaurants=new ArrayList<>();


        List<String> dishes=new ArrayList<>();
        dishes.add("Biryani");
        dishes.add("cake");
        dishes.add("ice cream");

        List<String> dishes1=new ArrayList<>();
        dishes1.add("Pizza");

        List<String> dishes2=new ArrayList<>();
        dishes.add("Biryani");
        dishes1.add("dosa");

        Restaurant restaurant=new Restaurant();
        restaurant.restaurantName="Pista House";
        restaurant.dishes=dishes;
        availableRestaurants.add(restaurant);

        Restaurant restaurant1=new Restaurant();
        restaurant.restaurantName="Pizza Hut";
        restaurant1.dishes=dishes1;
        availableRestaurants.add(restaurant1);

        Restaurant restaurant2=new Restaurant();
        restaurant.restaurantName="Paradise";
        restaurant.dishes=dishes2;
        availableRestaurants.add(restaurant2);

        available.availableRestaurant=availableRestaurants;

        LoginService swiggyService=new LoginService(available);
        swiggyService.login(customerDetails);


        SearchRestaurantService restaurantService=new SearchRestaurantService(available);
        restaurantService.search("Paradise");

    }
}
