package com.digitalhouse.payments.restcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping ("/payments")
public class PaymentsRestController {

    @PostMapping
    public void createPayment() {

    }

}
