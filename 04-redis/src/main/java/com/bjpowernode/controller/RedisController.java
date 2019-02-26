package com.bjpowernode.controller;

import com.bjpowernode.bean.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zhangguanle
 * @create 2019-02-22 20:11
 * spring boot 集成redis
 */
@Controller
public class RedisController {

    @Autowired
    private StudentService studentService;

    //这里的泛型要么写<String,String> 要么写<Object,Object>
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;


    @RequestMapping("/find")
    @ResponseBody
    public Object findAllStudent(){
        BoundValueOperations<Object, Object> ops = redisTemplate.boundValueOps("findAllStudentSpringboot");
       List<Student> list=(List<Student>) ops.get();
       if(list==null){
           System.out.println("从数据库中查询");
           list=studentService.selectAllStudent();
           ops.set(list);
       }
        return list;
    }

}
