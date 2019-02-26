package com.bjpowernode.controller;

import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangguanle
 * @create 2019-02-22 20:11
 * spring boot 集成mybatis
 */
@Controller
public class MybatisController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/find")
    @ResponseBody
    public Object findAllStudent(){
        System.out.println("测试");
        return studentService.selectAllStudent();
    }

}
