package demo6.pattern.command;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description:订单类
 * @author: ljt
 * @time: 2021/10/12 0012 10:20
 */
public class Order {

    //餐桌号码
    private int diningTable;

    //所下的餐品及份数
    private Map<String, Integer> map = new LinkedHashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public void setMap(String name, Integer num) {
        map.put(name, num);
    }
}
