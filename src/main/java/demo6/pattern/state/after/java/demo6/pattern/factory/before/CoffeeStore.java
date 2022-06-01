package demo6.pattern.state.after.java.demo6.pattern.factory.before;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/11 0011 11:16
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        //声明一个变量
        Coffee coffee =null;
        if ("AmericanCoffee".equals(type)){
          coffee=new AmericanCoffee();
        }
        if ("LatteCoffee".equals(type)){
            coffee=new LatteCoffee();
        }

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
