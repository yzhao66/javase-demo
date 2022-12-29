package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * @author zoh66
 * @Description
 * @create 2022-12-13 11:19 AM
 */
public class EnsureCapacityTest {


    @Test
    public void test1(){
        // 创建一个动态数组
        ArrayList<String> sites = new ArrayList<>();

        // 设置 arraylist的容量大小
        sites.ensureCapacity(3);

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("weibo");
        System.out.println("网站列表: " + sites);
    }
}
