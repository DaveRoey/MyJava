package junit;

import java.util.concurrent.RecursiveTask;

/**
 * Created by Dave on 2017/8/31
 * Describes
 */
public class UserService {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean userNameExist(String userName) {
        return "dave".equals(userName);
    }
}
