package demo6.pattern.adapter.class_adapter;

/**
 * @description: 目标接口
 * @author: ljt
 * @time: 2021/8/25 0025 10:59
 */
public interface SDCard {

    //从sd卡中读取数据
    String readSD();

    //往sd卡中写数据
    void writeSD(String msg);

}
