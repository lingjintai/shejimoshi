package demo6.pattern.factory.simple_factory;


/**
 * @description:
 * @author: ljt
 * @time: 2021/8/11 0011 11:16
 */

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee("AmericanCoffee");

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
