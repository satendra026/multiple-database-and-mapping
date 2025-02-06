package com.trilasoft.qualifier;


import org.springframework.stereotype.Service;

@Service("creditCardPayment")
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with Credit Card");
    }
}