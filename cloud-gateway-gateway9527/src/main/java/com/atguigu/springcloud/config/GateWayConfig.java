package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zy
 * @DateTime: 2020/5/7 16:40
 * @Description:
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {


        return builder.routes().route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                .route("path_route_atguigu2",
                        r -> r.path("/guoji")
                                .uri("http://news.baidu.com/guoji"))
                .route("path_route_atguigu3",
                        r -> r.path("/mil")
                                .uri("http://news.baidu.com/mil")).build();
    }
}
