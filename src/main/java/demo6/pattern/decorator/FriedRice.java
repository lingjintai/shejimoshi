package demo6.pattern.decorator;

/**
 * @description: 炒饭类  具体构件角色
 * @author: ljt
 * @time: 2021/8/27 0027 10:14
 */
public class FriedRice extends FastFood {

    public FriedRice() {
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
