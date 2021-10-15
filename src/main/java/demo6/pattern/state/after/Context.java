package demo6.pattern.state.after;

/**
 * @description: 环境角色类
 * @author: ljt
 * @time: 2021/10/14 0014 17:15
 */
public class Context {

    //定义对应状态对象的变量
    public final static OpeningState OPENING_STATE = new OpeningState();

    public final static CloseingState CLOSEING_STATE = new CloseingState();

    public final static RunningState RUNNING_STATE = new RunningState();

    public final static StopingState STOPING_STATE = new StopingState();

    // 定义一个当前电梯状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    //设置当前状态对象
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }


}
