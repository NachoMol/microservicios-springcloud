package com.digitalhouse.payments.restcontroller;

import com.digitalhouse.payments.model.Payment;
import com.digitalhouse.payments.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping ("/payments")
@RestController
public class PaymentsRestController {

    private PaymentService paymentService;

    public PaymentsRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public void createPayment(@RequestBody Payment payment) {
        System.out.println(payment);
        paymentService.createPayment(payment);

    }

}
