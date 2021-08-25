package demo6.pattern.adapter.class_adapter;

/**
 * @description: 适配者类
 * @author: ljt
 * @time: 2021/8/25 0025 10:36
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg = "TFCard  read msg : hello word TFCard";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
