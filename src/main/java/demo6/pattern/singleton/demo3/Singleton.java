package demo6.pattern.singleton.demo3;

//懒汉式
public class Singleton {

    //私有构造方法
    private Singleton() {

    }

    private static Singleton instance;


    //对外提供访问方式

    //线程不安全
    public static Singleton getInstance() {
        if (null == instance) {
            instance=new Singleton();
        }
        return instance;
    }

}
