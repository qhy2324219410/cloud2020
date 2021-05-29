package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共响应信息实体类
 * @author qhy
 * @create 2021/2/28
 */
@Data
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
