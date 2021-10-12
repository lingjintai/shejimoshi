package demo6.pattern.responsibility;

/**
 * @description: 部门经理类  具体的处理者
 * @author: ljt
 * @time: 2021/10/12 0012 16:17
 */
public class Manger extends Handler {

    public Manger() {
        super(1, Handler.NUM_THREE);
    }

    @Override
    protected void handlerLevel(LeaveRequest request) {
        System.out.println(request.getName() +
                "请假" + request.getNum() + "天" +
                request.getContent());
        System.out.println("部门经理审批 同意");
    }
}
