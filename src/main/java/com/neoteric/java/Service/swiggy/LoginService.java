package com.neoteric.java.Service.swiggy;

import com.neoteric.java.model.swiggy.Available;
import com.neoteric.java.model.swiggy.CustomerDetails;
import com.neoteric.java.model.swiggy.Otp;
import com.neoteric.java.model.swiggy.Restaurant;

import java.util.List;

public class LoginService {
    public String otp;
    public Available available;
    public LoginService(Available available){
        this.available=available;
    }
    public String generateOtp(){
        Otp generate=new Otp();
        generate.generatedOtp="1245";
        return generate.generatedOtp;
    }

    public List<Restaurant> login(CustomerDetails customerDetails){
        if(customerDetails.phnno.length()==10) {
            otp=generateOtp();
            if(otp==customerDetails.otp){
                System.out.println("Success");
                return available.availableRestaurant;
            }
        }
    return null;
    }
}
