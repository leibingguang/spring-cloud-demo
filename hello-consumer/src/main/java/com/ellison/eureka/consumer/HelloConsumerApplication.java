package com.ellison.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello 消费者
 *
 * @author leibingguang
 * @since 10/19/20 8:53 PM
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class HelloConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloConsumerApplication.class, args);
    }
}
