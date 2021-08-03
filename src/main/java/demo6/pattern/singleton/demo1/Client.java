package demo6.pattern.singleton.demo1;

public class Client {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();


        Singleton instance1 = Singleton.getInstance();


        System.out.println(instance==instance1);


        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}
