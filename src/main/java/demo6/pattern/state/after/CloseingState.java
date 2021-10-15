package demo6.pattern.state.after;

/**
 * @description:
 * @author: ljt
 * @time: 2021/10/14 0014 17:18
 */
public class CloseingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        //什么都不执行
    }

    @Override
    public void run() {
        //关闭状态下可以运行
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        //关闭状态下可以停止
        super.context.setLiftState(Context.STOPING_STATE);
        super.context.getLiftState().stop();
    }
}
