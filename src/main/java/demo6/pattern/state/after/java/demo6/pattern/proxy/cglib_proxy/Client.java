package demo6.pattern.state.after.java.demo6.pattern.proxy.cglib_proxy;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/23 0023 14:49
 */
public class Client {



    public static void main(String[] args) {
        ProxyFactory proxyFactory =new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();
        //调用代理对象
        proxyObject.sell();






    }
}
