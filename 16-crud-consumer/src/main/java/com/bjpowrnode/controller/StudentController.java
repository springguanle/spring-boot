package com.bjpowrnode.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.bean.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author zhangguanle
 * @create 2019-02-26 14:54
 */
@Controller
public class StudentController {
    @Reference//调用dubbo远程服务
    private StudentService studentService;

    //查询全部
    @RequestMapping("/index")
    public String index(Model model){
        List<Student> studentList = studentService.selectAllStudent();
        model.addAttribute("studentList",studentList);
        return "index";
    }
    //去修改页面
    @RequestMapping("/student/toUpdate")
    public String toUpdate(@RequestParam(value = "id") Integer id,Model model){
        Student student = studentService.selectStudentById(id);
        model.addAttribute("student",student);
        return "student";
    }
    //去添加页面
    @RequestMapping("/student/toAdd")
    public String toAdd(){
        return "student";
    }
    @RequestMapping("/student/addOrUpdate")
    public String addOrUpdate(Student student){
        if(student.getId()==null){
           //添加
            studentService.addStudent(student);

        }else{
            //修改
            studentService.updateStudent(student);
        }
        return "redirect:/index";
    }
    @RequestMapping("/student/delete")
    public String delete(@RequestParam("id") Integer id){
        studentService.deleteStudent(id);
        return "redirect:/index";
    }
}
