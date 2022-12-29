package privatetest;

/**
 * @author zoh66
 * @Description
 * @create 2022-12-29 6:20 PM
 */
public class Student {

    //成员变量
    String name;
    // int age;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

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
}
