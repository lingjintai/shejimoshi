package demo6.pattern.factory.factory_method;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/12 0012 11:36
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
