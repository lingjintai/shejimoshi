package demo6.pattern.state.after.java.xishushuzu;

import java.util.Scanner;

/**
 * @description: 用数组来表示环形队列
 * @author: ljt
 * @time: 2022/2/17 0017 14:24
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(4); //说明设置4    最大有效数据空间是3
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

class CircleArrayQueue {
    private int maxSize; //表示数组的最大容量
    private int front;// 变量的含义做一个调整 front 就指向队列的第一个元素  front 初始值为0
    private int rear; // rear变量的含义做一个调整 rear 指向队列的最后一个元素的后一个位置 希望空出一个元素
    private int[] arr;//用于存放数据 模拟队列

    //创建队列的构造器
    public CircleArrayQueue(int arrMaxSize) {
        this.maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = 0;
        rear = 0;
    }

    //判断队列是否是满的
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
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
        //直接将数据加入即可
        arr[rear] = n;
        //将rear后移
        rear = (rear + 1) % maxSize;

    }

    //获取队列的数据 出队列
    public int getQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空 不能取出数据 ");
        }
        //这里 需要分析出 front 是指向队列的第一个位置
        /**
         *  1先把 front 对应的值保留到一个临时变量
         *   2 将 front 后移 考虑取模
         *   3 将临时变量返回
         */
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    //显示队列的所有数据
    public void showQueue() {
        //判断队列是否为空
        if (isEmpty()) {
            System.out.println("队列为空 没有数据");
        }
        //从 front 开始遍历 遍历多少个元素

        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    //显示队列的头数据 注意不是取出数据
    public int headQueue() {
        //判断数组是否为空
        if (isEmpty()) {
            throw new RuntimeException("队列为空 不能取出数据 ");
        }
        return arr[front];
    }

    //返回队列中的有效个数
    public int size() {
        return (rear + maxSize - front) % maxSize;
    }


}

