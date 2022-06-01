package demo6.pattern.state.after.java.demo6.pattern.observer;

/**
 * @description:
 * @author: ljt
 * @time: 2021/10/21 0021 14:40
 */
public class Client {

    public static void main(String[] args) {
        // 创建公众号对象

        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        //订阅公众号
        subscriptionSubject.attach(new WeiXinUser("张三"));
        subscriptionSubject.attach(new WeiXinUser("王五"));
        subscriptionSubject.attach(new WeiXinUser("李四"));


        // 公众号更新 发出消息给订阅者 观察者对象
        subscriptionSubject.notify("更新了一部分内容");

    }
}
