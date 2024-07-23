package com.neoteric.java.Service.swiggy;

import com.neoteric.java.model.swiggy.Available;
import com.neoteric.java.model.swiggy.Restaurant;

import java.util.List;

public class OTPValidation {
    public String otp;
    public Available available;
    public OTPValidation(String otp,Available available){
        this.otp=otp;
        this.available=available;
    }
    public List<Restaurant> login(String userotp){
        if(userotp==otp){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Login failed");
        }
        return available.availableRestaurant;
    }
}
