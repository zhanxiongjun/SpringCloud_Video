package com.scauvideo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class SystemBoot {

    private static final Logger log = LoggerFactory.getLogger(SystemBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(SystemBoot.class);
        log.info("--System业务类微服务启动成功！");
    }
}
