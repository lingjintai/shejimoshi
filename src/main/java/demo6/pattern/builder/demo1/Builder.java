package demo6.pattern.builder.demo1;

/**
 * @description: 抽象建造者
 * @author: ljt
 * @time: 2021/8/16 0016 16:48
 */
public abstract class Builder {

    //声明bike类型的变量 并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract  void buildSeat();

    //构建自行车方法
    public  abstract  Bike createBike();




}
