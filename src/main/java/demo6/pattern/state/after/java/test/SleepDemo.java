package demo6.pattern.state.after.java.test;

/**
 * @description:
 * @author: ljt
 * @time: 2022/1/14 0014 15:04
 */
public class SleepDemo {

    private static final int SLEEP_GAP = 5000;

    private static final int MAX_TRUE = 1;


    static class SleepThread extends Thread {
        static int threadSeqNumber = 1;

        public SleepThread() {
            super("sleepThread-" + threadSeqNumber);
            threadSeqNumber++;
        }

        public void run() {
            try {
                for (int i = 0; i < MAX_TRUE; i++) {
                    System.out.println(getName() + ", 睡眠轮次" + i);
                    //让线程睡眠一会
                    Thread.sleep(SLEEP_GAP);
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + "发生异常导致线程结束");
            }
            System.out.println(getName() + "线程运行结束");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new SleepThread();
            thread.start();
        }

        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

}
