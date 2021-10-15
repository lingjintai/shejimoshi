package demo6.pattern.state.before;

/**
 * @description: 电梯类的子实现类
 * @author: ljt
 * @time: 2021/10/13 0013 11:09
 */
public class Lift implements ILift {

    //声明一个当前电梯的状态的变量
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了 ");
                //把电梯设置为开启状态
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                setState(OPENING_STATE);
                break;
            default:
                throw new IllegalArgumentException("不合法的参数");
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("电梯关门了 ");
                setState(CLOSING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了 ");
                //把电梯设置为开启状态
                setState(OPENING_STATE);
            case STOPPING_STATE:
                setState(OPENING_STATE);
            default:
                throw new IllegalArgumentException("不合法的参数");
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case CLOSING_STATE:
                //把电梯设置为开启状态
                System.out.println("电梯开始运行了");
                setState(RUNNING_STATE);
                break;
            case STOPPING_STATE:
                setState(RUNNING_STATE);
                break;
            default:
                throw new IllegalArgumentException("不合法的参数");
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了 ");
                setState(STOPPING_STATE);
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了 ");
                setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯停止了 ");
                setState(STOPPING_STATE);
                break;
            default:
                throw new IllegalArgumentException("不合法的参数");
        }
    }
}
