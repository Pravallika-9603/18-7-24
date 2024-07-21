package com.neoteric.java;

import com.neoteric.java.Service.loan.EligiblityCheck;
import com.neoteric.java.Service.loan.LoanApproval;
import com.neoteric.java.Service.loan.LoanApplicationService;
import com.neoteric.java.model.loan.Address;
import com.neoteric.java.model.loan.Customer;
import com.neoteric.java.model.loan.LoanApplication;
import com.neoteric.java.model.loan.Occupation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLoan {
    @Test
    public void loan(){
        Customer customer=new Customer();
        customer.name="Churi";
        customer.phnno="9553048885";
        customer.email="pravali9603@gmail.com";
        Address address=new Address();
        address.area="SP nagar";
        address.city="hyd";
        address.pincode="789456";
        Occupation occupation=new Occupation();
        occupation.role="S/w dev";
        occupation.sal = 70000;
        occupation.expenditure=20000;
        occupation.email="pravallika9603@gmail.com";
        Address address1=new Address();
        address1.area="hitech city";
        address1.city="hyd";
        occupation.address=address1;
        LoanApplication loanApplication=new LoanApplication();
        loanApplication.occupation=occupation;
        loanApplication.customerDetails=customer;
        loanApplication.address=address;
        LoanApplicationService loanApplicationService=new LoanApplicationService();
        String loanAppNo=loanApplicationService.loanProcessing(loanApplication);
        Assertions.assertNotNull(loanAppNo);
       LoanApproval loanApproval=new LoanApproval();
       int loanAmount=loanApproval.loanAmountApproval(loanApplication);
        Assertions.assertNotNull(loanAmount);
        Assertions.assertEquals(500000,loanAmount);
        EligiblityCheck eligiblityCheck=new EligiblityCheck(loanApproval);
       String loannum=eligiblityCheck.loanEligiblity(24);
        Assertions.assertNotNull(loannum);
    }
}
