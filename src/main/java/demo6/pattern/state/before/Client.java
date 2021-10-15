package demo6.pattern.state.before;

/**
 * @description:
 * @author: ljt
 * @time: 2021/10/14 0014 16:00
 */
public class Client {

    public static void main(String[] args) {

        //创建电梯对象
        Lift lift = new Lift();
        //设置电梯的状态
        lift.setState(ILift.OPENING_STATE);

        //打开
        lift.open();
        lift.close();
        lift.run();
        lift.stop();

    }
}
