package pair;


import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

/**
 * @author zoh66
 * @Description
 * @create 2022-12-17 4:13 PM
 */
public class PairTest1 {


    @Test
    public void test1(){
        Pair<Integer, Integer> pair = Pair.of(1, 10); //同ImmutablePair.of(1, 10)
        Integer left = pair.getLeft();
        Integer right = pair.getRight();
        System.out.println(left); //1
        System.out.println(right); //10
        System.out.println(pair);
    }


    @Test
    public void test2Copy(){
        Pair pair = Pair.of(1,10);
        System.out.println(pair.getLeft());
        System.out.println(pair.getRight());
        System.out.println(pair);
    }
}
