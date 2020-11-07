package com.scauvedio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayBoot {
    private static final Logger log = LoggerFactory.getLogger(GatewayBoot.class);


    public static void main(String[] args) {
        SpringApplication.run(GatewayBoot.class);
        log.info("GateWay网关启动成功啦");
    }
}
