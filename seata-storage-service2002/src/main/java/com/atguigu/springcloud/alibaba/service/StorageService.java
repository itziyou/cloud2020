package com.atguigu.springcloud.alibaba.service;

/**
 * @Author: zy
 * @DateTime: 2020/6/5 17:34
 * @Description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

