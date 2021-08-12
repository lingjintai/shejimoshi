package demo6.pattern.factory.factory_method;

/**
 * @description:美式咖啡工厂对象
 * @author: ljt
 * @time: 2021/8/12 0012 11:35
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
