package com.atguigu.springcloud.test;

import java.time.ZonedDateTime;

/**
 * @author zy
 * @Description
 * @date 2020-05-07 21:50
 */
public class Test {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        // 2020-05-07T21:51:15.876+08:00[Asia/Shanghai]
    }
}
