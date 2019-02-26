package com.bjpowernode.mapper;

import com.bjpowernode.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> selectAllStudent();

    Student selectStudentById(Integer id);

    int addStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(Integer id);
}
