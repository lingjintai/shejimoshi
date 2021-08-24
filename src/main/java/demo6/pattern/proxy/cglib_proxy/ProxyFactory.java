package demo6.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 代理对象工厂  用来获取代理对象
 * @author: ljt
 * @time: 2021/8/23 0023 14:40
 */
public class ProxyFactory implements MethodInterceptor {

    //声明为火车站对象
    private TrainStation trainStation = new TrainStation();


    public TrainStation getProxyObject() {
        //创建 Enhancer对象 类似于 jdk代理中的 proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);

        //创建代理对象
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //  System.out.println("方法执行了");

        System.out.println("代售点收取一定的服务费用+cglib代理");
        //调用目标对象的方法
        Object invoke = method.invoke(trainStation, objects);
        return null;
    }
}
