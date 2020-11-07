package com.scauvideo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@EnableEurekaServer
public class EurekaBoot {
    private static final Logger LOG = LoggerFactory.getLogger(EurekaBoot.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaBoot.class);
        // ConfigurableEnvironment environment = app.run(args).getEnvironment();
        LOG.info("注册中心项目启动成功！");
        // LOG.info("注册中心地址为：127.0.0.1" + environment.getProperty("server.port"));
    }
}
