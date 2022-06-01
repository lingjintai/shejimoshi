package demo6.pattern.state.after.java.demo6.pattern.singleton.demo5;

/**
 * @description:静态内部类方式
 * @author: ljt
 * @time: 2021/8/5 0005 11:05
 */
public class Singleton {


    private Singleton(){

    }

    //定义一个静态内部类
    private  static class  SingletonHolder{
        //在内部类声明并初始化外部类的对象
        private  static final Singleton INSTANCE =new Singleton();
    }

    //提供一个公共访问方式
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
