package generic;

/**
 * @author zoh66
 * @Description
 * @create 2023-04-21 15:43
 */
public class NumberTest {

//    private static int add(int a,int b){
//        System.out.println(a + "+" + b + "=" + (a + b));
//        return a + b;
//    }
//
//    private static float add(float a,float b){
//        System.out.println(a + "+" + b + "=" + (a + b));
//        return a + b;
//    }
//
//    private static double add(double a,double b){
//        System.out.println(a + "+" + b + "=" + (a + b));
//        return a + b;
//    }

    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }


    public static void main(String[] args) {
        add(1, 2);
        add(1.2f, 2.2f);
        add(1.2d, 2.2d);

    }
}
