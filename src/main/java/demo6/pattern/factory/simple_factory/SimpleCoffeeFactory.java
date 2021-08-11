package demo6.pattern.factory.simple_factory;

/**
 * @description:简单咖啡工厂
 * @author: ljt
 * @time: 2021/8/11 0011 11:34
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        //声明coffee类型变量 根据不同类型创建不同的子类对象
        Coffee coffee = null;
        if ("AmericanCoffee".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("LatteCoffee".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起你点的咖啡没有");
        }
        return coffee;
    }

}