package com.bjpowernode.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhangguanle
 * @create 2019-02-23 11:27
 */
//该注解是dubbo注解
@Service(interfaceClass = StudentService.class)
//@org.springframework.stereotype.Service 可以加上spring的service注解
@Component//该注解是spring的
public class StudentServiceImpl implements StudentService {
    @Override
    public void hello() {
         System.out.println("spring boot 集成了dubbo");
    }
}
