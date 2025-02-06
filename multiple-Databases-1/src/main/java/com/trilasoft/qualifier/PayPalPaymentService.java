package com.trilasoft.qualifier;

import org.springframework.stereotype.Service;

@Service("paypalPayment")
public class PayPalPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Processing payment with PayPal");
    }
}