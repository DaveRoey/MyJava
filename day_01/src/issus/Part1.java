package issus;

import org.junit.Test;

/**
 * Created by Dave on 2017/8/31
 * Describes switch
 */
public class Part1 {

    ///////////////////////////////////////////////////////////////////////////
    // switch 可以使用 byte shot int char String enum 包括他们的包装类
    ///////////////////////////////////////////////////////////////////////////
    @Test
    public void switchTest() {
        //字符
        char param1 = 'a';
        switch (param1) {
            case 'a':
                break;
            case 'b':
                break;
            default:
                System.out.println("do something ..");
        }

        //字符串
        String param2 = "hello world";
        switch (param2) {
            case "hello":
                break;
            case "gg":
                break;
            default:
                System.out.println("do something ..");
        }
        //byte
        byte param3 = 1;
        switch (param3) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("do something ..");
        }


    }


}
