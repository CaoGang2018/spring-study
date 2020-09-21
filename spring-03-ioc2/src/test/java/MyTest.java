import com.cao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin_cg
 * @data 2020/9/21 15:48
 */
public class MyTest {
    public static void main(String[] args) {

        // Spring容器所有bean在注册时被创建，并且只有一份实例。即配置文件加载时就已经初始化实例了
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("userT");
        user.show();
    }
}
