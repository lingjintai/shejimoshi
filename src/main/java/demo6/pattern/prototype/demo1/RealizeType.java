package demo6.pattern.prototype.demo1;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/16 0016 10:14
 */
public class RealizeType implements Cloneable {


    public RealizeType() {
        System.out.println("具体原型创建成功");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (RealizeType) super.clone();
    }
}
