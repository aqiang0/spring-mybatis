import com.aqiang.dao.BlogMapperImpl;
import com.aqiang.pojo.Blog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    ApplicationContext cpx = new ClassPathXmlApplicationContext("spring" +
            ".xml");
    BlogMapperImpl blogMapperImpl = cpx.getBean("blogMapperImpl", BlogMapperImpl.class);

    @Test
    public void getBlogsTest(){
/*
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring" +
                ".xml");

        BlogMapperImpl blogMapperImpl = cpx.getBean("blogMapperImpl", BlogMapperImpl.class);
*/

        List<Blog> blogs = blogMapperImpl.getBlogs();
        for(Blog blog : blogs){
            System.out.println(blog);
        }
    }

    @Test
    public void queryBlogIfTest(){
/*
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring" +
                ".xml");

        BlogMapperImpl blogMapperImpl = cpx.getBean("blogMapperImpl", BlogMapperImpl.class);
*/

        Map<String, String> map = new HashMap<String, String>();
//        map.put("title","java");
        map.put("author","aqiang");
        List<Blog> blogs = blogMapperImpl.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void updateBlogTest(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("title","java12211");
        map.put("author","李白");
        map.put("id","1");
        int i = blogMapperImpl.updateBlog(map);
    }

    @Test
    public void queryBlogChooseTest(){
        Map<String, String> map = new HashMap<String, String>();
//        map.put("title","java");
        map.put("author","aqiang");
//        map.put("views","998");
        List<Blog> blogs = blogMapperImpl.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }

    @Test
    public void queryBlogForeachTest(){
        HashMap map = new HashMap();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        map.put("ids",ids);
        List<Blog> blogs = blogMapperImpl.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}
