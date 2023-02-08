package collection;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * @author zoh66
 * @Description
 * @create 2023-02-08 9:44 AM
 */
public class MapComputelfAbsentTest {

    @Test
    public void test(){
        // 创建一个 HashMap
        HashMap<String, Integer> prices = new HashMap<>();

        // 往HashMap中添加映射项
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        // 计算 Shirt 的值
        int shirtPrice = prices.computeIfAbsent("Shirt", key -> 280);
        System.out.println("Price of Shirt: " + shirtPrice);

        // 输出更新后的HashMap
        System.out.println("Updated HashMap: " + prices);
    }
}
