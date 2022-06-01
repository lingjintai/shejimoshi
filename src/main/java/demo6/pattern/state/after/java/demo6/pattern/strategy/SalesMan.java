package demo6.pattern.state.after.java.demo6.pattern.strategy;

/**
 * @description: 促销员 环境类
 * @author: ljt
 * @time: 2021/10/11 0011 14:48
 */
public class SalesMan {

    //聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }


    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //有促销员展示促销活动 给用户
    public void salesManShow() {
        strategy.show();
    }

}
