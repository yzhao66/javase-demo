package proxy;

public class main {
    public static void main(String[] args) {
        SmsService smsService=new SmsServiceImpl();
        SmsProxy smsProxy=new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
