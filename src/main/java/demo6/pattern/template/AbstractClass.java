package demo6.pattern.template;

/**
 * @description: 抽象类 模板方法和基本方法
 * @author: ljt
 * @time: 2021/10/8 0008 16:18
 */
public abstract class AbstractClass {

    //模板方法定义
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }


    public void pourOil() {
        System.out.println("倒油");
    }

    //第二步 热油是一样的 所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    //第三步 倒蔬菜是一样的 （一个是下包菜 一个是下菜心）
    public abstract void pourVegetable();

    //第四步 倒调味料是不一样的
    public abstract void pourSauce();

    //第五步 翻炒是一样的 所以直接实现
    public void fry() {
        System.out.println("进行翻炒");
    }


}
