package com.digitalhouse.payments.restcontroller;

import com.digitalhouse.payments.model.Payment;
import com.digitalhouse.payments.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping ("/payments")
public class PaymentsRestController {

    private PaymentService paymentService;

    public PaymentsRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public void createPayment(Payment payment) {

        paymentService.createPayment(payment);

    }

}
