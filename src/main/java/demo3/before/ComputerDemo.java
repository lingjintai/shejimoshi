package demo3.before;

/**
 * @description:  计算机测试类
 * @author: ljt
 * @time: 2021/7/28 0028 15:15
 */
public class ComputerDemo {

    public static void main(String[] args) {

        //创建组件对象
        XiJieHardDisk xiJieHardDisk =new XiJieHardDisk();
        IntelCpu intelCpu =new IntelCpu();
        KingstonMemory kingstonMemory =new KingstonMemory();

        //创建计算机对象
        Computer computer =new Computer();
        //组装计算机
        computer.setXiJieHardDisk(xiJieHardDisk);
        computer.setIntelCpu(intelCpu);
        computer.setKingstonMemory(kingstonMemory);

        //运行计算机
        computer.run();
    }
}
