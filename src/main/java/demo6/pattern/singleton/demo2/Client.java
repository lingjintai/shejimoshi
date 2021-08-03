package demo6.pattern.singleton.demo2;

public class Client {

    public static void main(String[] args) {
        Singleton singleton =Singleton.getInstance();
        Singleton singleton1 =Singleton.getInstance();

        System.out.println(singleton == singleton1);//判断对象是否相等 来决定单列模式是否成功

    }
}
