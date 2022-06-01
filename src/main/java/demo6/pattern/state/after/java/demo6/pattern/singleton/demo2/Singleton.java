package demo6.pattern.state.after.java.demo6.pattern.singleton.demo2;

//饿汉式 静态代码块的方式
public class Singleton {


    //构造方法私有
    private Singleton() {

    }

    // 声明Singleton类型的变量
    private static Singleton instance = null;


    static {
        instance=new Singleton();
    }

    public static Singleton getInstance(){
        return  instance;
    }




}
