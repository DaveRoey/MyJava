package clone;

import org.junit.Test;

/**
 * Created by Dave on 2017/8/31
 * Describes 对象的克隆
 */
public class CloneTest implements Cloneable {
    private String name;
    private int age;


    ///////////////////////////////////////////////////////////////////////////
    // 使用 对象.clone()的方式 需要实现Cloneable标识接口 如果重写clone()方法 需要加上supper.clone()
    //
    ///////////////////////////////////////////////////////////////////////////

    @Test
    public void tes1() throws CloneNotSupportedException {

        CloneTest c1 = new CloneTest();
        c1.name = "dave";
        c1.age = 18;

        CloneTest c2 = (CloneTest) c1.clone();
        System.out.println(c2 == c1);//浅克隆 不是同一个对象
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = super.clone();//这个缺省的行为 会产生正确大小的空间
        return clone;
    }
}
