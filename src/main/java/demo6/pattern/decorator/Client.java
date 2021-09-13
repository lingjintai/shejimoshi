package demo6.pattern.decorator;

/**
 * @description: 装饰者模式
 * @author: ljt
 * @time: 2021/8/27 0027 10:39
 */
public class Client {
    public static void main(String[] args) {
        //点一份 炒饭
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + "   " + friedRice.cost());

        System.out.println("------------------------");
        //在炒饭中加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "   " + friedRice.cost());

        //选择在加一个鸡蛋
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "   " + friedRice.cost());

        //在加一个培根
        friedRice=new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + "   " + friedRice.cost());



    }
}
