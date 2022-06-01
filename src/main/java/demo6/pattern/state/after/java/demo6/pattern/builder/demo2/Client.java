package demo6.pattern.state.after.java.demo6.pattern.builder.demo2;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/17 0017 10:34
 */
public class Client {
    public static void main(String[] args) {
        new Phone.Builder()
                .cpu("intel")
                .screen("三星")
                .memory("内存条")
                .mainboard("主板")
                .build();
    }

}


