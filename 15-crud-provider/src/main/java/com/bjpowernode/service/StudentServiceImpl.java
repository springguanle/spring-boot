package com.bjpowernode.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.bean.Student;
import com.bjpowernode.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;


import java.util.List;

/**
 * @author zhangguanle
 * @create 2019-02-26 14:45
 */
@Service
@Component
public class StudentServiceImpl implements  StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public List<Student> selectAllStudent() {
        BoundValueOperations<Object,Object> ops=redisTemplate.boundValueOps("userList");
        List<Student> studentList=(List<Student>)ops.get();
        if(studentList==null){
            studentList=studentMapper.selectAllStudent();
            ops.set(studentList);
        }
        return studentList;
    }

    @Override
    public Student selectStudentById(Integer id) {
        return studentMapper.selectStudentById(id);
    }

    @Override
    public void addStudent(Student student) {
        int count = studentMapper.addStudent(student);
        if(count>0){
            redisTemplate.delete("userList");
        }
    }

    @Override
    public void updateStudent(Student student) {
       int count= studentMapper.updateStudent(student);
        if(count>0){
            redisTemplate.delete("userList");
        }
    }

    @Override
    public void deleteStudent(Integer id) {
        int count= studentMapper.deleteStudent(id);
        if(count>0){
            redisTemplate.delete("userList");
        }
    }
}
