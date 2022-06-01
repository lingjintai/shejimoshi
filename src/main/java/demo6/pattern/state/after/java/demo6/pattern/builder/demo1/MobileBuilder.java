package demo6.pattern.state.after.java.demo6.pattern.builder.demo1;

/**
 * @description:  具体的构建者  用来构建摩拜单车对象
 * @author: ljt
 * @time: 2021/8/16 0016 16:52
 */
public class MobileBuilder extends Builder {
    @Override
    public void buildFrame() {
         bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
