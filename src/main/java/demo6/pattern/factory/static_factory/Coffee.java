package demo6.pattern.factory.static_factory;

/**
 * @description: 咖啡类
 * @author: ljt
 * @time: 2021/8/11 0011 10:32
 */

public abstract class Coffee {

    public abstract String getName();
 
    //加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
