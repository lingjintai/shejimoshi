package demo6.pattern.state.after.java.demo6.pattern.responsibility;

/**
 * @description: 小组长类  具体的处理者
 * @author: ljt
 * @time: 2021/10/12 0012 16:17
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handlerLevel(LeaveRequest request) {
        System.out.println(request.getName() +
                "请假" + request.getNum() + "天" +
                request.getContent());
        System.out.println("小组长审批 同意");
    }
}
