package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author zoh66
 * @Description
 * @create 2022-11-24 7:09 PM
 */
public class CominationTest {


    @Test
    public void test1() {
        List a = new ArrayList<String>();
        a.add("1");
        a.add("1");
        a.add("2");
        a.add("2");
        a.add("12");
        a.add("13");
        a.add(null);
        a.add(null);
        System.out.println(a.stream().distinct().count());
    }




}
