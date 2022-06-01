package demo6.pattern.state.after.java.demo6.pattern.factory.abstract_factory;

/**
 * @description: 美式风味的甜品工厂  可以生产咖啡和甜品
 * @author: ljt
 * @time: 2021/8/12 0012 16:01
 */
public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
