package demo6.pattern.state.after.java.demo6.pattern.decorator;

/**
 * @description: 快餐抽象类  抽象构件角色
 * @author: ljt
 * @time: 2021/8/27 0027 10:05
 */
public abstract class FastFood {

    private float price;//价格

    private String desc;//描述

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();

}
