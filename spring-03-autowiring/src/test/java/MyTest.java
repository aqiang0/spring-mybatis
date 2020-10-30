import com.aqiang.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("beans1.xml");
//        Person person = (Person) cpx.getBean("person");
        Person person = cpx.getBean(Person.class);
        person.getCat().shout();
        person.getDog().shout();


    }

    @Test
    public void test2(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("beans2.xml");
//        Person person = (Person) cpx.getBean("person");
        Person person = cpx.getBean(Person.class);
        System.out.println(person.getName());
        person.getCat().shout();
        person.getDog().shout();


    }
}
