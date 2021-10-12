package demo6.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 服务员类 属于请求这角色
 * @author: ljt
 * @time: 2021/10/12 0012 10:55
 */
public class Waitor {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommands(Command cmd) {
        //将command对象存储到集合中
        commands.add(cmd);
    }

    //发起命令的功能 喊 订单来了
    public void orderUp() {
        System.out.println(
                "服务员 大厨 新的订单来了 "
        );
        //遍历list集合
        commands.forEach(x -> {
            if (null != x)
                x.execute();
        });


    }


}
