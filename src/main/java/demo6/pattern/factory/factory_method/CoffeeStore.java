package demo6.pattern.factory.factory_method;


/**
 * @description:
 * @author: ljt
 * @time: 2021/8/11 0011 11:16
 */

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
