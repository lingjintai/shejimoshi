package demo6.pattern.state.after.java.demo6.pattern.prototype.demo1;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/16 0016 10:18
 */
public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型对象
        RealizeType realizeType = new RealizeType();
        //调用圆形管类中的clone方法
        RealizeType clone = realizeType.clone();
        System.out.println(realizeType);
        System.out.println(clone);
    }
}
