package string;

import java.lang.reflect.Field;

/**
 * @author yzhao66
 * @Description
 * @create 2022-07-18 10:36
 */

public class StringTestReflection {


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "Hello World";
        Class<?>  sout=s.getClass();

        Field valueFieldOfString = s.getClass().getDeclaredField("value");
        valueFieldOfString.setAccessible(true);

        char[] value = (char[]) valueFieldOfString.get(s);

        //改变value所引用的数组中的第5个字符
        value[5] = '_';

        System.out.println("s = " + s);  //Hello_World


    }
}
