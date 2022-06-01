package demo6.pattern.state.after.java.demo6.pattern.responsibility;

/**
 * @description:  请假条类
 * @author: ljt
 * @time: 2021/10/12 0012 15:39
 */
public class LeaveRequest {

    //请假人姓名
    private  String name;

    //请假天数
    private  int num;

    //请假内容
    private String content;

    public LeaveRequest(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }


    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
