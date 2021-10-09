package demo6.pattern.template;

/**
 * @description:模板方法模式
 * @author: ljt
 * @time: 2021/10/9 0009 15:21
 */
public class Client {

    public static void main(String[] args) {
        //炒包菜
        //创建对象1111
        ConcreteClass_BaoCai concreteClass_BaoCai =new ConcreteClass_BaoCai();

        concreteClass_BaoCai.cookProcess();

    }
}
