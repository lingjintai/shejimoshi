package demo6.pattern.singleton.demo4;

/**
 * @description: 双重检查锁模式
 * @author: ljt
 * @time: 2021/8/5 0005 10:26
 */
public class Singleton {

    private Singleton() {

    }

    //提供声明Singleton变量
    private static  volatile Singleton singleton;

    //对外提供公共访问方式
    public  static Singleton getInstance() {
        //第一次判断 如果singleton的值不为null 不需要抢占锁 直接返回对象
        if (null == singleton) {
            synchronized (Singleton.class) {
                    if(null==singleton){
                        singleton=new Singleton();
                    }
            }
        }
        return singleton;
    }


}
