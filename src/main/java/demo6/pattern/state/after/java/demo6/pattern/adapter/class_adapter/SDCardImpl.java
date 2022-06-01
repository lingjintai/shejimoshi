package demo6.pattern.state.after.java.demo6.pattern.adapter.class_adapter;

/**
 * @description: 目标接口实现类  具体的sd卡类
 * @author: ljt
 * @time: 2021/8/25 0025 11:01
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg ： hello world sd";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard  write msg ："+msg);
    }
}
