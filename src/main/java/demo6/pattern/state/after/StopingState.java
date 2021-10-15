package demo6.pattern.state.after;

/**
 * @description: 电梯开启状态类
 * @author: ljt
 * @time: 2021/10/14 0014 17:18
 */
public class StopingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSEING_STATE);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了  ");

    }
}
