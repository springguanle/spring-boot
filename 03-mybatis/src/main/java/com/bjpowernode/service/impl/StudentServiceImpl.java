package com.bjpowernode.service.impl;

import com.bjpowernode.bean.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.springboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhangguanle
 * @create 2019-02-22 21:12
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }
}
