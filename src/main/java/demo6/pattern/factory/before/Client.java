package demo6.pattern.factory.before;

/**
 * @description: 工厂模式测试
 * @author: ljt
 * @time: 2021/8/11 0011 11:19
 */
public class Client {
    public static void main(String[] args) {
        //创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        //点咖啡
        Coffee coffee = coffeeStore.orderCoffee("AmericanCoffee");

        System.out.println(coffee.getName());


    }
}
