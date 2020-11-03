package com.aqiang.dao;

import com.aqiang.pojo.Blog;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class BlogMapperImpl implements BlogMapper {

    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }

    public List<Blog> getBlogs() {
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogs = blogMapper.getBlogs();
        return blogs;
    }

    public List<Blog> queryBlogIf(Map map) {
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogs = blogMapper.queryBlogIf(map);
        return blogs;
    }

    public int updateBlog(Map map) {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        int i = mapper.updateBlog(map);
        return i;
    }

    public List<Blog> queryBlogChoose(Map map) {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        return blogs;
    }

    public List<Blog> queryBlogForeach(Map map) {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        return blogs;
    }
}
