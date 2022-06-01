package demo6.pattern.state.after.java.demo6.pattern.singleton.demo4;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/5 0005 10:54
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton==singleton1);
    }
}
