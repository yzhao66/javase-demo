package cycleTest;

/**
 * @author zoh66
 * @Description
 * @create 2023-01-05 5:43 PM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new A());
    }
}



class A {
    public A() {
        new B();
    }
}

class B {
    public B() {
        new A();
    }
}