package collection;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author zoh66
 * @Description
 * @create 2022-11-24 6:55 PM
 */


public class TreeSetTest {


    @Test
    public void test1(){
        Set treeSet = new TreeSet();
        treeSet.add(null);
        System.out.println(treeSet.size());
    }
}
