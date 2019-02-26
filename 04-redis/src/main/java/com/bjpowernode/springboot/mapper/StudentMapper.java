package com.bjpowernode.springboot.mapper;

import com.bjpowernode.bean.Student;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface StudentMapper {
    List<Student> selectAllStudent();
}
