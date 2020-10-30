import com.aqiang.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){

        ApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
        Student student = cpx.getBean(Student.class);
//        System.out.println(student.getName());

        student.show();
    }

}
