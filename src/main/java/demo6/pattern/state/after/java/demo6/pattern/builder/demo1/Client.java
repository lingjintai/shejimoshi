package demo6.pattern.state.after.java.demo6.pattern.builder.demo1;

/**
 * @description: 建造者模式
 * @author: ljt
 * @time: 2021/8/16 0016 16:57
 */
public class Client {

    public static void main(String[] args) {

        Director director = new Director(new MobileBuilder());

        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

    }
}
