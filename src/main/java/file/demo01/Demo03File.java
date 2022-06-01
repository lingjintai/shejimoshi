package file.demo01;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        //   show01();

        show02();
        show03();
        show04();
    }

    /**
     * getAbsolutePath  返回file的绝对路径名字符串
     * 获取的构造方法中的传递路径
     * 无论路径是绝对路径还是相对的 getAbsolutePath方法返回的都是绝对路径
     */
    private static void show01() {
        File file = new File("D:\\javaWork\\shejimoshi\\a.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        File file1 = new File("a.txt");
        String absolutePath1 = file1.getAbsolutePath();
        System.out.println(absolutePath1);

    }

    /**
     * getPath  将此file转换为路径名字符串
     * 获取构造方法中传递的路径
     */
    private static void show02() {
        File file = new File("D:\\javaWork\\shejimoshi\\a.txt");
        String path = file.getPath();
        System.out.println(path);

        File file1 = new File("a.txt");
        String path1 = file1.getPath();
        System.out.println(path1);

    }

    /**
     * getName  获取的就是构造方法传递路径结尾部分
     */
    private static void show03() {
        File file = new File("D:\\javaWork\\shejimoshi\\a.txt");
        String name = file.getName();
        System.out.println(name);
    }


    /**
     * length
     * 获取的是构造方法指定的文件的大小 以字节为单位
     * 注意
     * 文件夹是没有大小概念的 不能获取文件夹的大小
     * 如果路径不存在 返回0
     */
    private static void show04() {
        File file = new File("D:\\javaWork\\shejimoshi\\a.txt");
        long length = file.length();
    }

}
