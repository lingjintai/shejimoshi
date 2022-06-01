package demo6.pattern.state.after.java.demo6.pattern.state.after;

/**
 * @description: 状态模式
 * @author: ljt
 * @time: 2021/10/15 0015 11:25
 */
public class Client {

    public static void main(String[] args) {

        //创建环境角色对象

        Context context = new Context();
        //设置当前电梯对象
        context.setLiftState(new RunningState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
