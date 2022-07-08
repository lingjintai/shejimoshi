package file.demo01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * java.io.Writer; 字符输出流
 * <p>
 * FileWriter
 * 字符输出流的使用步骤
 * 1 创建FileWriter对象 构造方法中绑定要写入的数据的目的地
 * 2  使用FileWriter中的write 把数据写入到内存缓冲区（字符转换为字节的过程） 因为计算机中存储的都是字节
 * 3 使用FileWriter中的方法flush 把内存缓冲区的数据 刷新到文件中
 * 4 释放资源
 */
public class Demo14File {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\d.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
