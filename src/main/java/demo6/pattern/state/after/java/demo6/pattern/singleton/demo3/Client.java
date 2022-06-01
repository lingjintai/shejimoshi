package demo6.pattern.state.after.java.demo6.pattern.singleton.demo3;

public class Client {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
