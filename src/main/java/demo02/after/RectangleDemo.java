package demo02.after;

/**
 * @description:
 * @author: ljt
 * @time: 2021/7/23 0023 10:27
 */
public class RectangleDemo {

    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle =new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        aaa(rectangle);



    }


    public static  void resize(Rectangle rectangle){
        //判断宽如果比较小  进行扩宽的操作
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }


    public static void aaa(Quadrilateral quadrilateral){

        System.out.println(quadrilateral.getLength());

        System.out.println(quadrilateral.getWidth());

    }


}
