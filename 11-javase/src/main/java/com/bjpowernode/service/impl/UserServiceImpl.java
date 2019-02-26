package com.bjpowernode.service.impl;

import com.bjpowernode.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zhangguanle
 * @create 2019-02-23 16:01
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void hello() {
        System.out.println("spring service");
    }
}
