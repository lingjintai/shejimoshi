package file.demo01;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * InputStream
 * 字节输入流的超类
 * 读取数据的原理
 * java程序--》jvm-->os--》os读取数据的方法--》读取文件
 * <p>
 * 字节输入流得到使用步骤
 * <p>
 * 1 创建FileInputStream对象构造方法中绑定的要读取的数据源
 * 使用read方法 读取文件
 * 释放资源
 */
public class Demo10File {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\a.txt");
        // read 读取文件中的一个字节并返回 读取文件末尾返回-1
//        int len = fis.read();
//        System.out.println(len);
//
//        len = fis.read();
//        System.out.println(len);
//        fis.close();
//
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.print((char)len);
        }
    }
}
