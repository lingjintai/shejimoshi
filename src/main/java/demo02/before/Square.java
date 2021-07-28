package demo02.before;

/**
 * @description:正方形的类
 * @author: ljt
 * @time: 2021/7/22 0022 16:45
 */
public class Square extends  Rectangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
