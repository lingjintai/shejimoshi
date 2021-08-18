package demo6.pattern.proxy.jdk_proxy;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/18 0018 16:01
 */
public class Client {

    public static void main(String[] args) {
        //获取代理对象
        //创建代理工厂对象

        ProxyFactory proxyFactory =new ProxyFactory();
        SellTickets sellTickets = proxyFactory.getProxyObject();

        sellTickets.sell();


    }
}
