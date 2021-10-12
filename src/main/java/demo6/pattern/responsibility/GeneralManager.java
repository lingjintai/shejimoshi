package demo6.pattern.responsibility;

/**
 * @description: 总经理类  具体的处理者
 * @author: ljt
 * @time: 2021/10/12 0012 16:17
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handlerLevel(LeaveRequest request) {
        System.out.println(request.getName() +
                "请假" + request.getNum() + "天" +
                request.getContent());
        System.out.println(" 总经理审批 同意");
    }
}
