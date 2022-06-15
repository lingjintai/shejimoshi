package file.demo01;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流  Reader 是字符输入流的最顶层的父类
 */
public class Demo13File {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\c.txt");
        int len = 0;//记录的是每次读取的有效字符个数
        char[] chars = new char[1024];//一次读取多个字符 将字符读入数组

        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        fr.close();

    }
}
