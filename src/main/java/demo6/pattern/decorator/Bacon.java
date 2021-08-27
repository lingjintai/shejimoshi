package demo6.pattern.decorator;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/27 0027 10:39
 */
public class Bacon  extends Garnish{

    public Bacon(FastFood fastFood) {
        super(1,"培根",fastFood);
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
