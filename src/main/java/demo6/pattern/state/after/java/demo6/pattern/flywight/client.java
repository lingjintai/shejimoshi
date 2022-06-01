package demo6.pattern.state.after.java.demo6.pattern.flywight;

/**
 * @description:
 * @author: ljt
 * @time: 2021/10/8 0008 13:53
 */
public class client {
    public static void main(String[] args) {

        //获取i图形对象
        BoxFactory instance = BoxFactory.getInstance();

        AbstractBox box1 = instance.getShape("I");
        box1.display("灰色");


        AbstractBox box2 = instance.getShape("I");
        box2.display("白色");

        System.out.println("判断对象是否相等"+(box1==box2));


    }
}
