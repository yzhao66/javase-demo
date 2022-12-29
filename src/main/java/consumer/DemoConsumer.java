package consumer;

import java.util.function.Consumer;

/**
 * @author zoh66
 * @Description
 * @create 2022-11-17 8:52 PM
 */
public class DemoConsumer {

    public  void main(String[] args) {
        consumerToString(s -> System.out.println(s));
    }



    private  void consumerToString(Consumer<String> T){
        T.accept("yzh 6666666");
    }
}
