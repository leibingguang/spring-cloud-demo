package com.ellison.eureka.consumer.service.impl;

import com.ellison.eureka.consumer.service.UserService;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author leibingguang
 * @since 11/4/20 9:48 PM
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserInfo(String id) {
        return "user id = " +id;
    }
}
