package com.aqiang.dao.demo02;

import com.aqiang.pojo.demo02.Teacher02;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Teacher02Mapper {
    List<Teacher02> getTeachers(@Param("id") int id);
}
