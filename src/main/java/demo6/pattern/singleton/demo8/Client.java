package demo6.pattern.singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: ljt 通过反射的方式去破坏单例模式
 * @time: 2021/8/5 0005 14:58
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Singleton字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        //获取无参构造方法的对象
        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();
        //取消访问检查
        declaredConstructor.setAccessible(true);
        //通过反射的方式去创建
        Singleton singleton = declaredConstructor.newInstance();

        Singleton singleton1 = declaredConstructor.newInstance();

        System.out.println(singleton == singleton1);


    }
}
