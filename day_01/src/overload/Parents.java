package overload;

import java.io.IOException;

/**
 * Created by Dave on 2017/8/29
 * Describes
 */
public class Parents {

    public  Parents(){
        System.out.println("父类构造执行了。。");
    }
    public void run() throws IOException{
        System.out.println("父类可以run");
    }
}
