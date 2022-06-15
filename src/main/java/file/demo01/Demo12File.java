package file.demo01;

import java.io.*;

/**
 * 文件的复制
 * 明确 数据源
 * 数据的目的地
 * <p>
 * 文件复制的步骤
 * 创建一个字节输入流对象 构造方法中要读取的数据源
 * 创建一个字节输出流对象 构造方法中绑定要写入的目的地
 * 使用字节输入流对象的方法read读取文件
 * 使用字节输出流中的write 把读取到的字节写入到目的地文件中
 * 释放资源
 */
public class Demo12File {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\333.jpg"));
        FileOutputStream fos = new FileOutputStream("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\3333.webp");
        //
        int len = 0;
        byte[] bytes = new byte[1024*10];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
     }
}
