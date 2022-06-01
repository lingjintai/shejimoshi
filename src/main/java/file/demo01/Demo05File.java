package file.demo01;

import java.io.File;
import java.io.IOException;

public class Demo05File {

    public static void main(String[] args) throws IOException {

        show01();

        show02();


        show03();


    }

    /**
     * file.delete();  删除由此file表示的文件或目录
     * 此方法 可以删除构造方法路径中的文件/文件夹
     * <p>
     * delete 方法是直接在硬盘删除文件/文件夹不走回收站 删除要谨慎
     */
    private static void show03() {
        File file = new File("D:\\javaWork\\shejimoshi\\b.txt");
        file.delete();

    }


    /**
     * file.mkdir(); 创建单极空文件夹
     * <p>
     * file.mkdirs();  创建多级的空文件夹
     */
    private static void show02() {
        File file = new File("D:\\javaWork\\shejimoshi\\a");
        file.mkdir();
        file.mkdirs();
    }

    /**
     * @throws IOException createNewFile 当且仅当具有该名称的文件尚不存在时 创建一个新的空文件
     *                     创建文件的路径和名称在构造方法中给出
     *                     <p>
     *                     注意此方法只能创建文件 不能创建文件夹
     *                     创建的文件夹路径必须存在 否则会报错
     */
    private static void show01() throws IOException {
        File file = new File("src\\main\\java\\file\\b.txt");
        if (!file.exists())
            file.createNewFile();
    }
}
