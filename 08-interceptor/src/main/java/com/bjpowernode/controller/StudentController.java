package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangguanle
 * @create 2019-02-23 13:43
 */
@Controller
public class StudentController {


    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "login sucess";
    }

    @RequestMapping("/loginout")
    public String loginout(){
        return "退出成功";
    }
}
