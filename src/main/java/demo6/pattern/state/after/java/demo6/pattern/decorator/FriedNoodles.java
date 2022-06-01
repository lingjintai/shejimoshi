package demo6.pattern.state.after.java.demo6.pattern.decorator;

/**
 * @description: 炒面类 具体构件角色
 * @author: ljt
 * @time: 2021/8/27 0027 10:17
 */
public class FriedNoodles extends FastFood {

    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
