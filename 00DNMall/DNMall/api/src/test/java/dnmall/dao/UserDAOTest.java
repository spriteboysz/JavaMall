package dnmall.dao;

import com.deean.ApiApplication;
import com.deean.dnmall.bean.User;
import com.deean.dnmall.dao.UserDAO;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ApiApplication.class)
class UserDAOTest {

    @Resource
    private UserDAO userDAO;

    @Test
    void queryUserByName() {
        User user = userDAO.queryUserByName("admin");
        System.out.println(user);
        assertEquals(user.getUserPassword(), "123456");
    }
}