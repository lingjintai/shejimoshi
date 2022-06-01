package demo6.pattern.state.after.java.demo6.pattern.flywight;

/**
 * @description: 抽象 享元角色
 * @author: ljt
 * @time: 2021/10/8 0008 14:09
 */
public abstract class AbstractBox {

    //获取图形的方法

    public abstract String getShape();

    //显示图形及颜色

    public void display(String color) {
        System.out.println("方块形状：" + getShape() + " ,颜色：" + color);
    }
}



