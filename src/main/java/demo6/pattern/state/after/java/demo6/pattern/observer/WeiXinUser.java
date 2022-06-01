package demo6.pattern.state.after.java.demo6.pattern.observer;

/**
 * @description: 具体的观察者角色类
 * @author: ljt
 * @time: 2021/10/21 0021 14:39
 */
public class WeiXinUser implements Observer {
    private String name ;


    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ": "+message);
    }
}
