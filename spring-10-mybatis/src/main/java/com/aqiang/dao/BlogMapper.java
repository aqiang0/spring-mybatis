package com.aqiang.dao;

import com.aqiang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    List<Blog> getBlogs();
    List<Blog> queryBlogIf(Map map);
    int updateBlog(Map map);
    List<Blog> queryBlogChoose(Map map);
    List<Blog> queryBlogForeach(Map map);
}
