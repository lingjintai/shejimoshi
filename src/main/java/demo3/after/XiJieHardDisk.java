package demo3.after;

/**
 * @description: 希捷硬盘
 * @author: ljt
 * @time: 2021/7/28 0028 14:59
 */
public class XiJieHardDisk implements HarDisk {

    //存储数据的方法
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据为:" + data);
    }

    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }




}
