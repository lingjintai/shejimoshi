package file.demo01;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流 一次读取多个字节得到方法
 */

public class Demo11File {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\a.txt");

        byte[] data = new byte[1024]; //存储读取到的多个字节

        int len = 0;//记录每次读取的1有效字节个数
        while ((len = fis.read(data))!=-1) {
            System.out.println(new String(data,0,len));
        }
        fis.close();
    }

}
