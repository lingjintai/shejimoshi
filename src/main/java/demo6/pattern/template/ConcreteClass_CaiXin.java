package demo6.pattern.template;

/**
 * @description: 炒菜心类
 * @author: ljt
 * @time: 2021/10/9 0009 15:18
 */
public class ConcreteClass_CaiXin extends  AbstractClass {
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("放的调料蒜蓉");
    }
}
