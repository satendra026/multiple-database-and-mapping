package com.trilasoft.controller;

import com.trilasoft.qualifier.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QualifierController {

//    @Qualifier("creditCardPayment")
    private  PaymentService paymentService;

//    @Qualifier("paypalPayment")
    private  PaymentService paymentService1;

    @Autowired
    public QualifierController(@Qualifier("creditCardPayment") PaymentService paymentService, @Qualifier("paypalPayment") PaymentService paymentService1) {
        this.paymentService = paymentService;
        this.paymentService1 = paymentService1;
    }

    @GetMapping("/qualifier")
    public ResponseEntity<String> makePayment() {
        paymentService.processPayment();
        return new ResponseEntity<>("request executed successfully.", HttpStatus.OK);
    }
}
