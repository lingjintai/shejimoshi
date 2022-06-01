package demo6.pattern.state.after.java.demo4.before;

/**
 * @description:  黑马品牌安全门
 * @author: ljt
 * @time: 2021/7/30 0030 16:57
 */
public class HeiMaSafetyDoor implements SafetyDoor {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }
}
