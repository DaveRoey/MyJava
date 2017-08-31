package clone;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dave on 2017/8/31
 * Describes 对象序列化
 */
public class Serialize {

    ///////////////////////////////////////////////////////////////////////////
    // 对象的深克隆 -》序列化
    ///////////////////////////////////////////////////////////////////////////

    /**
     * 序列化
     */
    @Test
    public void writeObj() {
        File file = new File("stu.dat");
        if (!file.exists()) {
            file = new File("stu.dat");
        }
        Student stu1 = new Student("dave", 19, "c# kotlin");
        Student stu2 = new Student("roey", 16, "java kotlin");
        Student stu3 = new Student("bob", 13, "java 潘金莲");
        Student stu4 = new Student("lisa", 12, "苍老师 kotlin");
        List<Student> list = Arrays.asList(stu1, stu2, stu3, stu4);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(list);
        } catch (FileNotFoundException e) {
            System.out.println("打开文件失败！");
        } catch (Exception e) {
            System.out.println("写入失败。");
        }
    }

    /**
     * 反序列化
     */
    @Test
    public void readObj() {
        File file = new File("stu.dat");
        List<Student> list = new ArrayList<>();

        try {
            InputStream ins = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(ins);
            while (true) {
                list = (List<Student>) in.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到");
        } catch (EOFException e) {

        } catch (Exception e) {
            System.out.println("读取失败。。");
        }
        list.forEach(e -> System.out.println(e.getName()));

    }


}
