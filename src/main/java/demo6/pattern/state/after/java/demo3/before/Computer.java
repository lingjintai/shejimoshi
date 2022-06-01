package demo6.pattern.state.after.java.demo3.before;

/**
 * @description:
 * @author: ljt
 * @time: 2021/7/28 0028 15:05
 */
public class Computer {

    private XiJieHardDisk xiJieHardDisk ;
    private IntelCpu intelCpu;

    private KingstonMemory kingstonMemory;


    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

    public IntelCpu getIntelCpu() {
        return intelCpu;
    }

    public void setIntelCpu(IntelCpu intelCpu) {
        this.intelCpu = intelCpu;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }


    public void  run(){
        System.out.println("运行计算机");
        String data = xiJieHardDisk.get();
        System.out.println("从硬盘上获取的数据是："+data);
        intelCpu.run();
        kingstonMemory.save();

    }

}
