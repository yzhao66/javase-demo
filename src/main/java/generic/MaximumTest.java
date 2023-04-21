package generic;

/**
 * @author zoh66
 * @Description
 * @create 2023-02-06 4:23 PM
 */
public class MaximumTest {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        // 假设x是初始最大值
        T max = x;
        if (y.compareTo(max) > 0) {
            //y 更大
            max = y;
        }
        if (z.compareTo(max) > 0) {
            // 现在 z 更大
            max = z;
        }
        // 返回最大对象
        return max;
    }
    public static void main(String[] args)
    {
        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );
    }
}
