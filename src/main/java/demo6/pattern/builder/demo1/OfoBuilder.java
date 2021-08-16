package demo6.pattern.builder.demo1;

/**
 * @description: ofo单车构建
 * @author: ljt
 * @time: 2021/8/16 0016 16:54
 */
public class OfoBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
