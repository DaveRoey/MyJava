package clone;

import java.io.Serializable;

/**
 * Created by Dave on 2017/8/31
 * Describes
 */
public class Student implements Serializable {
    private String name;
    private int age;
    transient private String hobby;//不序列化

    public Student(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
