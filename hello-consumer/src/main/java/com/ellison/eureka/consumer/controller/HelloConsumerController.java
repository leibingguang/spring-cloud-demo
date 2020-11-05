package com.ellison.eureka.consumer.controller;

import com.ellison.eureka.consumer.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author leibingguang
 * @since 10/19/20 9:05 PM
 */
@RestController
public class HelloConsumerController {
    @LoadBalanced
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @HystrixCommand(fallbackMethod = "errorFallback")
    @GetMapping(value = "/hello")
    public String hello(@RequestParam("name") String name) {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://hello-provider/hello?name=" + name, String.class);

        return responseEntity.getBody();
    }

    @GetMapping(value = "/userInfo")
    public String getUserInfo(@RequestParam("id") String id) {
        return userService.getUserInfo(id);
    }

    public String errorFallback(String errorMessage) {
        return "error : " + errorMessage;
    }
}
