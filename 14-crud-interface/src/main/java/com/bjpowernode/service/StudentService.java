package com.bjpowernode.service;

import com.bjpowernode.bean.Student;

import java.util.List;

/**
 * @author zhangguanle
 * @create 2019-02-26 14:31
 */
public interface StudentService {


    List<Student> selectAllStudent();

    Student selectStudentById(Integer id);

    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Integer id);
}
