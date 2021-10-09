package demo6.pattern.flywight;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 工厂类 将该类设计为单例
 * @author: ljt
 * @time: 2021/10/8 0008 14:16
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> hashMap;

    private static BoxFactory factory = new BoxFactory();

    //在构造方法中进行初始化操作
    public BoxFactory() {
        hashMap = new HashMap<>();
        hashMap.put("I", new Ibox());
        hashMap.put("O", new Obox());
        hashMap.put("L", new Lbox());

    }

    //提供一个方法获取改工厂对象
    public static BoxFactory getInstance() {
        return factory;
    }


    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return hashMap.get(name);
    }
}
