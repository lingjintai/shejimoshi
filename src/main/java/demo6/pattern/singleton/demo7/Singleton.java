package demo6.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * @description:静态内部类方式
 * @author: ljt
 * @time: 2021/8/5 0005 11:05
 */
public class Singleton implements Serializable {


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


    //这里进行二次修改 修改之后 序列化就不会破坏单例
    //当进行反序列化 会自动调用该方法 会直接返回
    public Object readResolve(){
        return  SingletonHolder.INSTANCE;
    }




}
