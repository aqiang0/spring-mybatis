import com.aqiang.dao.UserImplFromMysql;
import com.aqiang.dao.UserImplFromOracle;
import com.aqiang.pojo.Hello;
import com.aqiang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = cpx.getBean("hello", Hello.class);
        hello.show();
    }

    @Test
    public void test1(){
        //需要DAO层什么类型的依赖，只需要这里注入即可，不用修改service的代码
        //后续需要其他需求，只需要增加DAO层的实现
//        UserServiceImpl service = new UserServiceImpl(new UserImplFromMysql());
        UserServiceImpl service = new UserServiceImpl(new UserImplFromOracle());
        service.getUser(2);
    }
}
