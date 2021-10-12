package demo6.pattern.command;

import java.util.Map;

/**
 * @description:具体的命令类
 * @author: ljt
 * @time: 2021/10/12 0012 10:39
 */
public class OrderCommand implements Command {

    //持有接收者对象
    private SeniorChef reciver;

    private Order order;

    public OrderCommand(SeniorChef reciver, Order order) {
        this.reciver = reciver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单:");
        Map<String, Integer> footDir = order.getMap();
        //遍历map集合
        for (Map.Entry<String, Integer> foot : footDir.entrySet()) {
            reciver.makeFood(foot.getKey(), foot.getValue());
        }
        System.out.println(order.getDiningTable() + "桌的饭准备完毕");
    }
}
