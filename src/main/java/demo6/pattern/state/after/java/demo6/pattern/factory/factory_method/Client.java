package demo6.pattern.state.after.java.demo6.pattern.factory.factory_method;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/12 0012 11:40
 */
public class Client {

    public static void main(String[] args) {
        //创建咖啡店
        CoffeeStore coffeeStore =new CoffeeStore();
        coffeeStore.setFactory(new AmericanCoffeeFactory()); //如果这里想新增新的咖啡品种那就 创建新的咖啡工厂
        Coffee coffee = coffeeStore.orderCoffee();


        System.out.println(coffee.getName());
    }
}
