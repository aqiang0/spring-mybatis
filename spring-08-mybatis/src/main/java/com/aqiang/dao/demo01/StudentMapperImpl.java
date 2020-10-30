package com.aqiang.dao.demo01;

import com.aqiang.pojo.demo01.Student;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class StudentMapperImpl implements StudentMapper{

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public int insertStudent(Map map) {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        int i = mapper.insertStudent(map);
        return i;
    }

    public List<Student> getStudents() {
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        return students;
    }
}
