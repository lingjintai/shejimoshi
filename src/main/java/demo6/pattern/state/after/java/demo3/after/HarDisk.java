package demo6.pattern.state.after.java.demo3.after;

/**
 * @description: 硬盘接口
 * @author: ljt
 * @time: 2021/7/30 0030 9:53
 */
public interface HarDisk {

    //存储接口
    public void save(String data);

    //获取数据的方法
    public String get();

}
