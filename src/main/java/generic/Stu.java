package generic;

/** 学生类
 * @author zoh66
 * @Description
 * @create 2023-02-25 4:27 PM
 */
public class Stu<N, A, S> {

    private N name;

    private A age;

    private S sex;

    public Stu(N name, A age, S sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public N getName() {
        return this.name;
    }
    public void setName(N name){
        this.name=name;
    }

    public A getAge() {
        return this.age;
    }

    public void setAge(A age){
        this.age=age;
    }

    public S getSex() {
        return this.sex;
    }

    public void setSex(S sex){
        this.sex =sex;
    }
    public String toString(){

        return "name:"+this.name+"age："+this.age+"sex:"+sex;
    }
    public static void main(String[] args) {
        Stu<String,Integer,Integer> stu=new Stu<>("杨卓豪",1,1);
        System.out.println(stu.toString());
    }
}
