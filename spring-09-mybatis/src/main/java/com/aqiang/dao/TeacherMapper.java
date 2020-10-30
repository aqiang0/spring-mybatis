package com.aqiang.dao;

import com.aqiang.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getTeachers(int id);
}
