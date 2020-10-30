package com.aqiang.dao.demo02;

import com.aqiang.pojo.demo02.Teacher02;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class Teacher02MapperImpl implements Teacher02Mapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Teacher02> getTeachers(@Param("id") int id) {
        Teacher02Mapper mapper = sqlSession.getMapper(Teacher02Mapper.class);
        List<Teacher02> teachers = mapper.getTeachers(id);
        return teachers;
    }
}
