package file.demo01;

import java.io.File;

/**
 * file类遍历文件夹功能
 *
 */
public class Demo06File {
    public static void main(String[] args) {

         show01();

    }

    private static void show01() {
        File file = new File("D:\\javaWork\\shejimoshi");
        String[] list = file.list(); //获取文件名
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();

    }
}
