package demo6.pattern.state.after.java.demo6.pattern.facde;

/**
 * @description: 外观模式
 * @author: ljt
 * @time: 2021/9/8 0008 9:59
 */
public class Client {

    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade =new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开");

    }
}
