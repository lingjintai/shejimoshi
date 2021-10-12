package demo6.pattern.strategy;

/**
 * @description: 具体的策略类 封装算法的
 * @author: ljt
 * @time: 2021/10/11 0011 14:36
 */
public class StrategyC implements Strategy {
    @Override
    public void show() {
        System.out.println("满1000加1元换购任意200以下的商品");
    }
}
