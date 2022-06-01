package demo6.pattern.state.after.java.demo6.pattern.mediator;

/**
 * @description: 具体的同事角色类
 * @author: ljt
 * @time: 2021/10/22 0022 15:31
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介联系 沟通
    public void constact(String message) {
        mediator.constact(message, this);
    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("房主：" + name + "获取到的信息是:" + message);
    }

}
