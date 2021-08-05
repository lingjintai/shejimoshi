package demo6.pattern.singleton.demo7;

import java.io.*;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/5 0005 11:09
 */
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writeObject2File();

        readObject2File();
        readObject2File();
    }

    //从文件读取数据（对象）
    public static void readObject2File() throws IOException, ClassNotFoundException {
        //获取输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\ceishi\\a.txt"));

        //读取对象
        Singleton singleton = (Singleton) ois.readObject();

        System.out.println(singleton);
        //释放资源
        ois.close();
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws IOException {
        //获取Singleton对象
        Singleton instance = Singleton.getInstance();

        //创建对象流输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\ceishi\\a.txt"));

        //写对象
        oos.writeObject(instance);

        //释放资源
        oos.close();
    }
}
