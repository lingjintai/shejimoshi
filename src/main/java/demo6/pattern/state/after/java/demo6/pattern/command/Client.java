package demo6.pattern.state.after.java.demo6.pattern.command;

/**
 * @description: 命令模式
 * @author: ljt
 * @time: 2021/10/12 0012 11:01
 */
public class Client {

    public static void main(String[] args) {
        //创建两个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setMap("鸡蛋炒面", 1);
        order1.setMap("啤酒", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setMap("鸡蛋炒饭", 1);
        order2.setMap("可乐", 2);

        //创建厨师对象
        SeniorChef recever = new SeniorChef();

        //创建命令对象
        OrderCommand orderCommand1 = new OrderCommand(recever
                , order1);
        OrderCommand orderCommand2 = new OrderCommand(recever
                , order2);

        //创建调用者  服务员对象
        Waitor invoke = new Waitor();
        invoke.setCommands(orderCommand1);
        invoke.setCommands(orderCommand2);

        invoke.orderUp();


    }
}
