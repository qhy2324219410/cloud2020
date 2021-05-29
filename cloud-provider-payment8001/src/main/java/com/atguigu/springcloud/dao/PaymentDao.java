package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 订单支付持久层接口
 * @author qhy
 * @create 2021/2/28
 */
@Mapper
public interface PaymentDao {
    // 新增订单信息
    int create(Payment payment);

    // 根据ID获取订单信息
    Payment getPaymentById(@Param("id") Long id);
}
