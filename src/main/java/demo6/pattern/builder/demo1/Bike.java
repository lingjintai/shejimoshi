package demo6.pattern.builder.demo1;

/**
 * @description: 具体产品对象
 * @author: ljt
 * @time: 2021/8/16 0016 16:47
 */
public class Bike {

    private  String frame;//车架

    private  String seat ;//车座


    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
