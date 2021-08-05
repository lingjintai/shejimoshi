package demo6.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: ljt 通过反射的方式去破坏单例模式
 * @time: 2021/8/5 0005 14:58
 */
public class Client {
    public static void main(String[] args) throws NoSuchMethodException {
        //获取Singleton字节码对象
        Class<Singleton> singletonClass = Singleton.class;
        //获取无参构造方法的对象

        Constructor<Singleton> declaredConstructor = singletonClass.getDeclaredConstructor();


    }
}
