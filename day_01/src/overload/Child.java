package overload;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Dave on 2017/8/29
 * Describes
 */
public class Child extends Parents {

    public Child() {
        System.out.println("子类的构造执行了。。。");
    }

    ///////////////////////////////////////////////////////////////////////////
    // 在overload的时候 客服端的访问修饰符不能大于服务端  抛出的异常不能大于客户端
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public void run() throws IOException {
        System.out.println("儿子可以run...");
    }

    public static void main(String[] args) throws IOException {
        Parents p = new Child();
        p.run();

    }

    ///////////////////////////////////////////////////////////////////////////
    // 重载是发生子在同一个类中 参数的个数 类型  顺序都有影响，但是返回值不是重载的依据
    ///////////////////////////////////////////////////////////////////////////
    public void run(String name) {
        System.out.println("我是重载的方法。。");
    }
    
    /*老哥 返回类型不是重载的依据
    public String run(String name){
        System.out.println("不能。。");
    }*/


    ///////////////////////////////////////////////////////////////////////////
    // 先调用父类构造 再调用子类构造
    ///////////////////////////////////////////////////////////////////////////
    @Test
    public void gouZao() {
        Parents p = new Child();
        p = new Child();//父
        System.out.println("华丽丽的分割线。。。。。。。。。");

        Child child = new Child();//先执行父类的构造

    }


}
