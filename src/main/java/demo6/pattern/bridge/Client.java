package demo6.pattern.bridge;

/**
 * @author ：_my
 * @date ：Created in 2021/8/31 20:38
 * @description： 桥接模式
 * @modified By：`
 * @version: 1.0
 */
public class      Client {
    public static void main(String[] args) {
        //创建mac
        OpratingSystem system =new Mac(new AviFile());
        //使用操作系统
        system.play("新闻中心");
    }
}
