package demo4.after;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/2 0002 14:31
 */
public class HeiMaSafetyDoor implements AntiTheft, Fireproof, Waterproof {
    public void antiTheft() {
        System.out.println("这里是防盗功能");
    }

    public void fireproof() {
        System.out.println("这里是防火功能");

    }

    public void waterproof() {
        System.out.println("这里是防水功能");
    }
}
