package demo6.pattern.adapter.class_adapter;

/**
 * @description: 适配器类
 * @author: ljt
 * @time: 2021/8/25 0025 11:12
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {


    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        writeTF(msg);
    }
}
