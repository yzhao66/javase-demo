package enumtest;

import org.apache.commons.lang3.ObjectUtils;

/**
 * @author zoh66
 * @Description
 * @create 2023-02-22 5:30 PM
 */
public enum TestEnum {

    wechat_open("1","微信开放"),
    ding_ding_open("2","钉钉开放");

    private String code;
    private String value;

    TestEnum(String code, String value) {
    }

    public static void main(String[] args) {
        TestEnum testEnum= TestEnum.valueOf(TestEnum.class,"ding_ding_open");
        System.out.printf(String.valueOf(testEnum.value));
        TestEnum[] enumConstants =TestEnum.class.getEnumConstants();
        System.out.println(enumConstants);

    }
}
