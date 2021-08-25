package demo6.pattern.adapter.object_adapter;

/**
 * @description: 适配者类的接口
 * @author: ljt
 * @time: 2021/8/25 0025 10:31
 */
public interface TFCard {

    //从tf卡 读取数据
    String readTF();

    //往tf 卡 写数据
    void writeTF(String msg);


}
