package demo6.pattern.decorator;

/**
 * @description: 鸡蛋类   具体的装饰这角色
 * @author: ljt
 * @time: 2021/8/27 0027 10:34
 */
public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(1,"鸡蛋",fastFood);
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice()+getFastFood().cost();
    }


    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
