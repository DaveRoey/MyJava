package junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Dave on 2017/8/31
 * Describes 测试使用
 */
public class UserServiceTest {

    @Test
    public void addTest() {
        UserService service = new UserService();
        Assert.assertEquals("测试失败。。", 11, service.add(1, 1));
    }

    @Test
    public void userNameExistTest() {
        UserService service = new UserService();
        boolean isExist = service.userNameExist("av");
        Assert.assertTrue("账号不存在。。", isExist);
    }
}
