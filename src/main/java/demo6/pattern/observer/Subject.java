package demo6.pattern.observer;

/**
 * @description: 抽象主题角色类
 * @author: ljt
 * @time: 2021/10/21 0021 11:14
 */
public interface Subject {


    //添加订阅者 添加观察者对象
    void attach(Observer observer);

    //删除订阅者

    void detach(Observer observer);

    //通知订阅者 更新消息

    void notify(String message);



}
