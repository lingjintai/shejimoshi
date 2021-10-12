package demo6.pattern.responsibility;

/**
 * @description: 职责链 模式
 * @author: ljt
 * @time: 2021/10/12 0012 16:26
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 3, "身体不适");
        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manger manger = new Manger();
        GeneralManager generalManager = new GeneralManager();

        //设置处理链
        groupLeader.setNextHandler(manger);
        manger.setNextHandler(generalManager);
        //小明提交请假申请
        manger.submit(leaveRequest);
    }
}
