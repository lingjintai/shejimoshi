package demo6.pattern.state.after.java.demo6.pattern.mediator;

/**
 * @description:抽象同事类
 * @author: ljt
 * @time: 2021/10/22 0022 15:22
 */
public abstract class Person {

    protected String name;

    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }


}
