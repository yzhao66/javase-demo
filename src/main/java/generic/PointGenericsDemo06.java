package generic;

/**
 * @author zoh66
 * @Description
 * @create 2023-04-28 9:06
 */
class Point<T> {
    private T var;

    public T getVar() {  // 返回值的类型由外部决定
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}

public class PointGenericsDemo06 {
    public static void main(String[] args) {
        Point<String> point = new Point<>();
        point.setVar("it");
        System.out.println(point.getVar());
    }
}

