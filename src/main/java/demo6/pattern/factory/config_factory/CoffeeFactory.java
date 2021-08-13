package demo6.pattern.factory.config_factory;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * @description:抽象工厂角色
 * @author: ljt
 * @time: 2021/8/12 0012 11:34
 */
public class CoffeeFactory {

    //加载配置文件 然后获取文件中配置的全类名 并创建类对象存储
    //定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> hashMap = new HashMap<>();

    //加载配置文件 只需要加载一次

    static {
        //2.1
        Properties properties =new Properties();
        //获取输入流
        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(resourceAsStream);
            //从p集合全类名并创建对象
            for (Object key : properties.keySet()) {
                String className = properties.getProperty((String) key);
                 //通过反射技术 创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                hashMap.put((String)key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static Coffee createCoffee(String name) {
        return hashMap.get(name);
    }

}
