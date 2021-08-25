package demo6.pattern.adapter.object_adapter;

/**
 * @description: 适配器类
 * @author: ljt
 * @time: 2021/8/25 0025 11:12
 */
public class SDAdapterTF implements SDCard {


    //声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card ");
        tfCard.writeTF(msg);
    }
}
