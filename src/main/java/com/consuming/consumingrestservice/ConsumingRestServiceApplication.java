package com.consuming.consumingrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.consuming.consumingrestservice.proxy")
public class ConsumingRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestServiceApplication.class, args);
    }

}
