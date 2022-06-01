package file.demo01;

import java.io.File;

public class Demo04File {

    public static void main(String[] args) {
         show01();
         show02();
    }


    /**
     * file.exists() 此file表示的文件或目录是否实际存在
     * 用于判断构造方法的路径是否存在
     */
    private static void  show01(){
        File file = new File("D:\\javaWork\\shejimoshi\\a.txt");
        System.out.println(file.exists());
    }

    /**
     * file.isDirectory()
     * 用于判断构造方法中给定的路径是否以文件夹结尾
     *
     *file1.isFile() 判断是否以文件结尾
     */
    private static void show02() {
        File file = new File("D:\\javaWork\\shejimoshi");
        System.out.println(file.isDirectory());
        File file1 = new File("D:\\javaWork\\shejimoshi\\a.txt");
        System.out.println(file1.isFile());
    }

}
