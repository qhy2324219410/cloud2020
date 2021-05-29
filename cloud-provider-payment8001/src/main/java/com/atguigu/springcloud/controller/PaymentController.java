package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.sun.media.jfxmedia.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 支付订单控制层
 * @author qhy
 * @create 2021/2/28
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 创建支付订单
     * @param payment
     * @return
     */
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        System.err.println("插入结果："+result);
        if (result > 0 ){
            return new CommonResult(200,"订单创建成功！",result);
        }else{
            return new CommonResult(444,"订单创建失败！",null);
        }
    }

    /**
     * 根据id获取支付订单
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        System.err.println("插入结果："+result);
        if (result != null){
            return new CommonResult(200,"查询成功",result);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }
}
