package demo6.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:获取代理对象的工厂类 代理类也应实现对应的接口
 * @author: ljt
 * @time: 2021/8/18 0018 15:46
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        //返回代理对象即可
        /**
         * 三个参数说明
         * ClassLoader loader,  类加载器  用于加载代理类  可以通过目标对象获取
         * Class<?>[] interfaces, 代理类实现的接口的字节码对象
         * InvocationHandler h ,代理对象的调用处理程序
         */
        SellTickets sellTickets =(SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    /**
                     * Object proxy, 代理对象  和sellTickets 是同一个对象
                     * Method method, 对接口中的方法进行封装的调用
                     * Object[] args 调用方法的实际参数11
                     *
                     * 返回值就是方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的服务费用");
                        //执行目标方法
                        Object invoke = method.invoke(trainStation, args);
                        return null;
                    }
                }

        );

        return sellTickets;

    }

}
