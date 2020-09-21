import com.cao.pojo.Student;
import com.cao.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin_cg
 * @data 2020/9/21 16:49
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
        /**
         *Student{
         * name='我',
         * address=Address{address='null'},
         * books=[红楼梦, 西游记, 水浒传, 三国演义],
         * hobby=[听歌, 敲代码, 看电影],
         * card={
         *      身份证=111111222222222222,
         *      银行卡=221231213112131212
         *      },
         * games=[LOL, COC, bob],
         * wife='null',
         * info={
         *      学号=12345678,
         *      性别=男
         *      }
         * }
         */
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.toString());
        System.out.println(user2.toString());
    }

}
