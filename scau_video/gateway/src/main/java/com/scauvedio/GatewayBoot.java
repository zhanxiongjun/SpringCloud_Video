package com.scauvedio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class GatewayBoot {
    private static final Logger log = LoggerFactory.getLogger(GatewayBoot.class);


    public static void main(String[] args) {
        SpringApplication.run(GatewayBoot.class);
        log.info("GateWay网关启动成功啦");
    }
    /*@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/system/test")
                        .uri("http://localhost:8881"))
                .build();
    }*/

}
