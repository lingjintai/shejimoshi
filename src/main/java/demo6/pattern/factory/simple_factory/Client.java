package demo6.pattern.factory.simple_factory;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/11 0011 15:13
 */
public class Client {

    public static void main(String[] args) {

        CoffeeStore coffeeStore =new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("AmericanCoffee");
        System.out.println(coffee.getName());

    }
}
