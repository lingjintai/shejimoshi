package demo6.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体主题角色类
 * @author: ljt
 * @time: 2021/10/21 0021 11:27
 */
public class SubscriptionSubject implements Subject {

    // 定义一个集合 用来存储多个观察者对象
    private List<Observer> weiXinUserList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {

        // 遍历集合
        weiXinUserList.forEach(x -> {
            //调用观察者中的update 方法
            x.update(message);
        });
    }
}
