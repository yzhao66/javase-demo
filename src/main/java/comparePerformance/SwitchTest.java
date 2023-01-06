package comparePerformance;

import org.junit.jupiter.api.Test;

/**
 * @author zoh66
 * @Description
 * @create 2023-01-06 3:57 PM
 */


public class SwitchTest {


    @Test
    public void switchTest() {
        Integer a = 2;
        switch (a){
            case 1:
                Integer b;
                System.out.println(1);
                break;
            case 2:
                b = 3;
                System.out.println(2+b);
                break;
            case 3:
                b=6;
                System.out.println(3+b);
                break;
            case 4:
                System.out.println(4);
                break;
        }
    }
}
