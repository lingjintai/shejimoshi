package demo6.pattern.singleton.demo6;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/5 0005 11:30
 */
public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;

        Singleton instance1 = Singleton.INSTANCE;

        System.out.println(instance==instance1);


    }
}
