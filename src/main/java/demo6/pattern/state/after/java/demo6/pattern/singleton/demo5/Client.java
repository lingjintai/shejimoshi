package demo6.pattern.state.after.java.demo6.pattern.singleton.demo5;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/5 0005 11:09
 */
public class Client {

    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton singleton1= Singleton.getInstance();
        System.out.println(singleton==singleton1);
    }
}
