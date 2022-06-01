package demo6.pattern.state.after.java.demo3.after;

/**
 * @description:
 * @author: ljt
 * @time: 2021/7/30 0030 10:06
 */
public class ComputerDemo {

    public static void main(String[] args) {

        //创建计算机对象
        HarDisk harDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();


        //创建计算机对象
        Computer computer = new Computer();

        //组装计算机
        computer.setCpu(cpu);
        computer.setHarDisk(harDisk);
        computer.setMemory(memory);

        //运行计算机
        computer.run();



    }

}
