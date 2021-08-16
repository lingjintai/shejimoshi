package demo6.pattern.builder.demo1;

/**
 * @description: 指挥者类
 * @author: ljt
 * @time: 2021/8/16 0016 16:55
 */
public class Director {

    //声明builder类型的变量

    private Builder builder;


    public Director(Builder builder) {
        this.builder = builder;
    }

    //组装自行车的方法
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }


}
