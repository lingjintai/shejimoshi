package demo6.pattern.state.after.java.demo6.pattern.state.after;

/**
 * @description: 电梯开启状态类
 * @author: ljt
 * @time: 2021/10/14 0014 17:18
 */
public class OpeningState extends LiftState {

    //当前状态要执行的方法
    @Override
    public void open() {
        System.out.println("电梯开启。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSEING_STATE);
        //调用当前状态中的context的close方法
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //什么都不做

    }

    @Override
    public void stop() {
        //什么都不做

    }
}
