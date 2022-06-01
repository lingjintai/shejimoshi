package demo6.pattern.state.after.java.demo6.pattern.state.after;

/**
 * @description: 电梯开启状态类
 * @author: ljt
 * @time: 2021/10/14 0014 17:18
 */
public class RunningState extends LiftState {
    @Override
    public void open() {
        //什么都不做
    }

    @Override
    public void close() {
        //什么都不做
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行 ");

    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPING_STATE);
        super.context.getLiftState().stop();
    }
}
