package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.entitis.CommonResult;
import com.atguigu.springcloud.entitis.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: zy
 * @DateTime: 2020/5/26 13:51
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
