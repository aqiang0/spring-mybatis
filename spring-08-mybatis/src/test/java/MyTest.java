import com.aqiang.dao.UserMapper;
import com.aqiang.dao.UserMapperImpl;
import com.aqiang.dao.demo01.StudentMapperImpl;
import com.aqiang.dao.demo02.Teacher02MapperImpl;
import com.aqiang.pojo.User;
import com.aqiang.pojo.demo01.Student;
import com.aqiang.pojo.demo02.Teacher02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {

    @Test
    public void getUsersTest() {
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        UserMapperImpl userMapperImpl = cpx.getBean("UserMapperImpl", UserMapperImpl.class);
        List<User> users = userMapperImpl.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void getUserLimitTest() {
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        UserMapperImpl userMapperImpl = cpx.getBean("UserMapperImpl", UserMapperImpl.class);
        Map<String, Integer> map = new HashMap<String, Integer>();
        int startIndex = 1;
        int pageSize = 2;
        map.put("startIndex", startIndex);
        map.put("pageSize", pageSize);
        List<User> userLimit = userMapperImpl.getUserLimit(map);
        for (User user : userLimit) {
            System.out.println(user);
        }
    }

    @Test
    public void insertStudentTest() {
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        StudentMapperImpl studentMapperImpl = cpx.getBean("StudentMapperImpl", StudentMapperImpl.class);
        Map map = new HashMap();
        map.put("id", 6);
        map.put("name", "大师兄");
        map.put("tid", 1);
        int i = studentMapperImpl.insertStudent(map);
        System.out.println(i);
    }

    @Test
    public void getStudentsTest() {
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        StudentMapperImpl studentMapperImpl = cpx.getBean("StudentMapperImpl", StudentMapperImpl.class);
        List<Student> students = studentMapperImpl.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    public void getTeachersTest() {
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring.xml");
        Teacher02MapperImpl teacher02MapperImpl = cpx.getBean("Teacher02MapperImpl", Teacher02MapperImpl.class);
        List<Teacher02> teacher02s = teacher02MapperImpl.getTeachers(1);
        for (Teacher02 teacher : teacher02s) {
            System.out.println(teacher);
        }
    }
}
