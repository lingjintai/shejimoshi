package demo6.pattern.factory.config_factory;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/13 0013 14:34
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
        System.out.println("=============================");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
