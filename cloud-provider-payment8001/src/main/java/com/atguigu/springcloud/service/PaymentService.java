package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entitis.Payment;

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
