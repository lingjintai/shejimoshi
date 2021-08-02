package demo4.after;

/**
 * @description: 盼盼安全门 只有防盗防火功能
 * @author: ljt
 * @time: 2021/8/2 0002 14:37
 */
public class PanpanDoor implements AntiTheft, Fireproof {
    public void antiTheft() {
        System.out.println("这里是防盗功能");
    }

    public void fireproof() {
        System.out.println("这里是防火功能");
    }
}
