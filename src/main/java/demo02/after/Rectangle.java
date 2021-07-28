package demo02.after;

/**
 * @description:
 * @author: ljt 长方形的类
 * @time: 2021/7/23 0023 10:26
 */
public class Rectangle implements Quadrilateral {

    private  double length;

    private  double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
