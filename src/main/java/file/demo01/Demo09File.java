package file.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 追加写/续写 使用两个参数的构造方法
 */
public class Demo09File {
    public static void main(String[] args) throws IOException {
        /**
         * append  是否追加写
         */
        FileOutputStream fos = new FileOutputStream("D:\\javaWork\\shejimoshi\\src\\main\\java\\file\\c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes()); //换行
        }
        fos.close();
    }
}
