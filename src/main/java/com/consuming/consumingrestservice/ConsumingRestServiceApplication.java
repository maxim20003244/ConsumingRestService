package com.consuming.consumingrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.consuming.consumingrestservice.proxy")
public class ConsumingRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestServiceApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate() {
        RestTemplateBuilder restTemplateBuilder =
                new RestTemplateBuilder();
        return restTemplateBuilder.basicAuthentication
                ("maxim2000324@gmail.com", "admin").build();
    }
}
