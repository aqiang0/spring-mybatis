import com.aqiang.dao.UserMapper;
import com.aqiang.dao.UserMapperImpl;
import com.aqiang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void getUsersTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserMapperImpl userMapper = context.getBean("userMapper", UserMapperImpl.class);
        List<User> users = userMapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserLimitTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        UserMapperImpl userMapper = (UserMapperImpl) context.getBean("userMapper");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        int start = 1;
        int size = 2;
        Map<String, Integer> p = new HashMap<String, Integer>();
        p.put("start",start);
        p.put("size",size);
        List<User> users = userMapper.getUserLimit(p);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
