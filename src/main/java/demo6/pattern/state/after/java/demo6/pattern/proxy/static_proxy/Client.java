package demo6.pattern.state.after.java.demo6.pattern.proxy.static_proxy;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/18 0018 11:10
 */
public class Client {

    public static void main(String[] args) {
        //创建代售点对象
        ProxyPoint proxyPoint =new ProxyPoint();
        //调用方法进行卖票
        proxyPoint.sell();
    }
}
