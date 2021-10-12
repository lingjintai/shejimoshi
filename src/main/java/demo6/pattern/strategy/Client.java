package demo6.pattern.strategy;

/**
 * @description:  策略模式
 * @author: ljt
 * @time: 2021/10/11 0011 15:40
 */
public class Client {
    public static void main(String[] args) {
        //春节来了 使用春节促销活动
        SalesMan salesMan =new SalesMan(new StrategyA());
        // 展示促销活动
        salesMan.salesManShow();


        System.out.println("========================");
        //中秋节日  使用中秋节的促销活动
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();

    }
}
