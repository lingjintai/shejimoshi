package demo6.pattern.state.after.java.demo6.pattern.decorator;

/**
 * @description: 装饰者类  抽象装饰角色
 * @author: ljt
 * @time: 2021/8/27 0027 10:19
 */
public abstract class Garnish extends FastFood {

    // 生命快餐类的 变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }


}
