package file.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/*
      一次写多个字节的方法

 */
public class Demo08File {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\a.txt");
        String aa = "我的dsadsa";
        fos.write(49);
        fos.write(48);
        fos.write(48);
        fos.write(aa.getBytes());
        fos.close();
    }
}
