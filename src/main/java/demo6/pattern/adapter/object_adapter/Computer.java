package demo6.pattern.adapter.object_adapter;

/**
 * @description: 计算机类
 * @author: ljt
 * @time: 2021/8/25 0025 11:04
 */
public class Computer {

    //从sd 卡中读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null ");
        }
        return sdCard.readSD();
    }

}
