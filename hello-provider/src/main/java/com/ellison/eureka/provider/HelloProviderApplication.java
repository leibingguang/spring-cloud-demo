package com.ellison.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * spring cloud eureka provider
 *
 * @author leibingguang
 * @since 10/19/20 2:56 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloProviderApplication.class, args);
    }

}
