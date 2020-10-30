package com.aqiang.dao;

import com.aqiang.pojo.Teacher;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class TeacherMapperImpl implements TeacherMapper{

    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }
    public List<Teacher> getTeachers(int id) {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.getTeachers(1);
        return teachers;
    }
}
