package demo6.pattern.factory.abstract_factory;

/**
 * @description: 意大利风味甜品工厂 生产拿铁咖啡和提拉米苏
 * @author: ljt
 * @time: 2021/8/12 0012 16:09
 */
public class ItalyDessertFactory implements DessertFactory {
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
