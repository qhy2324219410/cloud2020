package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 支付订单服务层接口
 * @author qhy
 * @create 2021/2/28
 */
public interface PaymentService {
    // 新增订单信息
    int create(Payment payment);

    // 根据ID获取订单信息
    Payment getPaymentById(@Param("id") Long id);
}
