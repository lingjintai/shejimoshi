package demo6.pattern.state.after.java.xishushuzu;

import java.util.Scanner;

/**
 * @description: 用数组来实现队列
 *
 * @author: ljt
 * @time: 2022/2/16 0016 15:26
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(4); //说明设置4    最大有效数据空间是3
        char key = ' '; //接收用户输入
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 从队列头取出数据");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    queue.addQueue(scanner.nextInt());
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = queue.headQueue();
                        System.out.printf("取出的头部数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    System.out.println("退出程序");
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }

        }

    }
}

class ArrayQueue {
    private int maxSize; //表示数组的最大容量
    private int front;//队列头
    private int rear; //队列尾部
    private int[] arr;//用于存放数据 模拟队列

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize) {
        this.maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1; //指向队列头部 分析出 front 是指向队列头的前一个位置
        rear = -1;// 指向队列尾 指向队列尾的数据 就是队列的最后一个数据
    }

    //判断队列是否是满的
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        //判断队列是否是满的
        if (isFull()) {
            System.out.println("队列已满 无法加入数据");
            return;
        }
        rear++; //让rear 后移
        arr[rear] = n;
    }

    //获取队列的数据 出队列
    public int getQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空 不能取出数据 ");
        }
        front++;
        return arr[front];
    }

    //显示队列的所有数据
    public void showQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            System.out.println("队列为空 没有数据");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    //显示队列的头数据 注意不是取出数据
    public int headQueue() {
        //判断数组是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空 不能取出数据 ");
        }
        return arr[front + 1];
    }

}





