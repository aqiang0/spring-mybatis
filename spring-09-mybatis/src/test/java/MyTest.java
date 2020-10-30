import com.aqiang.dao.TeacherMapperImpl;
import com.aqiang.pojo.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void getTeachersTest(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("spring" +
                ".xml");
        TeacherMapperImpl teacherMapperImpl = cpx.getBean("TeacherMapperImpl", TeacherMapperImpl.class);
        List<Teacher> teachers = teacherMapperImpl.getTeachers(1);
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
