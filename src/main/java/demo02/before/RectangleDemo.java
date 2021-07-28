package demo02.before;

/**
 * @description:
 * @author: ljt
 * @time: 2021/7/22 0022 16:48
 */
public class RectangleDemo {
    public static void main(String[] args) {
    //创建长方形对象
        Rectangle rectangle =new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(5);
        //调用resize进行扩宽操作
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("================");

//        Square square =new Square();
//        square.setLength(10);
//        resize(square);
//        printLengthAndWidth(square);


    }

    //扩宽方法

    public static  void resize(Rectangle rectangle){
        //判断宽如果比较小  进行扩宽的操作
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }


    //打印长和宽
    public static  void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }


}
