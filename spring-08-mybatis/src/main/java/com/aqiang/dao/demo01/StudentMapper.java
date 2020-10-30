package com.aqiang.dao.demo01;

import com.aqiang.pojo.demo01.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {

    int insertStudent(Map map);
    //获取所有学生及其对应的老师的信息
    List<Student> getStudents();
}
