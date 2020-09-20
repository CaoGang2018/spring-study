import com.cao.service.UserService;
import com.cao.service.UserServiceImpl;

/**
 * @author admin_cg
 * @date 2020/9/9 19:16
 */
public class MyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.getUser();
    }
}
