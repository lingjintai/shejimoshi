package demo6.pattern.state.after.java.demo6.pattern.proxy.static_proxy;

/**
 * @description: 代售点卖票
 * @author: ljt
 * @time: 2021/8/18 0018 11:04
 */
public class ProxyPoint implements SellTickets {

    //声明火车站对象
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费");
        trainStation.sell();
    }
}
