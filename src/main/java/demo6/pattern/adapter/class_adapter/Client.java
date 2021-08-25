package demo6.pattern.adapter.class_adapter;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/25 0025 11:05
 */
public class Client {

    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取sd卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("========================================");

        // 使用该计算机 读取tf卡中的数据
        //定义适配器类
        String msg1 = computer.readSD(new SDAdapterTF());
        System.out.println(msg1);
    }
}
