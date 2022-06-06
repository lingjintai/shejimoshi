package file.demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutputStream   抽象类是表示字节输出流的所有类的超类 将指定的字节信息写出到目的地
 * <p>
 * FileOutputStream 文件字节输出流
 * 作用 把内存中的数据写入到硬盘中
 * <p>
 * 写入数据的原理 内存-》硬盘
 * java程序--》jvm（java虚拟机）--》os（操作系统）--》os调用写数据的方法 -->把数据写入到文件中
 * <p>
 * 字节输出流的使用步骤
 * 1 创建FileOutputStream对象 构造方法中传递写入数据的目的地
 * 2 调用write方法
 * 3  释放资源 流使用占用一定的内存 使用完毕要把内存清空  提供程序的效率
 */
public class Demo07File {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\b1 .txt",true);
        fos.write(97);
        fos.write(98);
        fos.close();
    }
}
