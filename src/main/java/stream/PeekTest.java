package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zoh66
 * @Description
 * @create 2023-03-25 15:50
 */
public class PeekTest {


    public static void main(String[] args) {
        //peek其实就是 debug模式
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
