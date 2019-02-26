package com.bjpowernode.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangguanle
 * @create 2019-02-23 11:34
 * Dubbo
 */
@Controller
public class DubboController {
    @Reference//使用dubbo注解应用远程的dubbo
    private StudentService studentService;


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        studentService.hello();
        return "hello";
    }
}
