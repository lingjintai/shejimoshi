package demo6.pattern.state.before;

/**
 * @description: 电梯接口
 * @author: ljt
 * @time: 2021/10/13 0013 11:01
 */
public interface ILift {

    //定义四个电梯的状态
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    //设置电梯状态的功能
    void setState(int state);

    //电梯操作功能
    void open();

    void close();

    void run();

    void stop();

}
