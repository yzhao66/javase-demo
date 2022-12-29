package statickeyword;

import org.junit.jupiter.api.Test;

/**
 * @author zoh66
 * @Description
 * @create 2022-12-17 4:55 PM
 */
public class StaticKeyWordTest {



    @Test
    public void test1(){
        StaticModel.i++;
        StaticModel staticMode = new StaticModel() ;
        StaticModel staticMode2 = new StaticModel() ;
        System.out.println(staticMode.i);
        System.out.println(staticMode2.i);
    }
}
