package com.bjpowernod.controller;

import com.bjpowernod.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * @author zhangguanle
 * @create 2019-02-23 17:07
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("msg","hello thymeleaf");
        return "index";
    }

    @RequestMapping("/student")
    public String userInfo(Model model, HttpSession session){
        Student student=new Student();;
        student.setAge(10);
        student.setName("张三");
        student.setAddress("上海");
        student.setId(1);

        Student student1=new Student();;
        student1.setAge(10);
        student1.setName("张三1");
        student1.setAddress("上海1");
        student1.setId(2);

        Student student2=new Student();;
        student2.setAge(10);
        student2.setName("张三2");
        student2.setAddress("上海2");
        student2.setId(3);

        ArrayList<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        model.addAttribute("student",student);
        model.addAttribute("list",list);

        session.setAttribute("id",888);

        return "student";

    }

}
