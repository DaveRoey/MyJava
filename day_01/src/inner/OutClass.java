package inner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dave on 2017/8/29
 * Describes
 */
public class OutClass {

    public class InnerClass{
        public void run(){
            System.out.println("内部类跑起来。。");

        }
    }

    public static void main(String[] args) {
        List<Integer> test  = new ArrayList<>();
        int i = 1;
        try {
            while(true){
                test.add(i);
                i++;
                System.out.println(i);
            }
        }catch (Exception e){
            System.out.println("i="+test.size());
        }

    }
}
