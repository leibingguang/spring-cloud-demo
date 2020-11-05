package com.ellison.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Hello Controller
 *
 * @author leibingguang
 * @since 10/19/20 4:45 PM
 */
@RestController
public class HelloProviderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name) {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances("eureka-provider");
        serviceInstanceList.stream().forEach(serviceInstance -> System.out.println(serviceInstance));
        System.out.println(services);
        return "Hello, " + name;
    }
}
