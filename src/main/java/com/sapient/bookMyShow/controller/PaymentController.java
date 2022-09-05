package com.sapient.bookMyShow.controller;

import com.sapient.bookMyShow.entity.response.PaymentResponse;
import com.sapient.bookMyShow.entity.request.PaymentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("payments")
public class PaymentController {

    @PostMapping("/make-payment")
    public PaymentResponse makePayment(PaymentRequest paymentRequest) {
        return PaymentResponse.builder().status(Boolean.FALSE).build();
    }
}
