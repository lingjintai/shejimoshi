package demo6.pattern.state.after.java.demo6.pattern.facde;

/**
 * @description: 外观对象
 * 用户 主要和该类对象交互
 * @author: ljt
 * @time: 2021/9/8 0008 9:52
 */
public class SmartAppliancesFacade {

    //聚合电灯对象 电视机对象 空调对象

    private Light light;
    private AirCondition airCondition;
    private TV tv;

    public SmartAppliancesFacade() {
        light = new Light();
        airCondition = new AirCondition();
        tv = new TV();
    }

    //通过语音控制
    public void say(String message) {
        if (message.contains("打开")) {
            on();
        } else if (message.contains("关闭")) {
            off();
        } else {
            System.out.println("听不懂你说的是什么");
        }
    }


    private void on() {
        light.on();
        airCondition.on();
        tv.on();
    }

    private void off() {
        light.off();
        airCondition.off();
        tv.off();
    }
}
