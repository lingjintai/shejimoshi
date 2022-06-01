package file.demo01;

import java.io.File;

/**
 * java.io.File类
 * 文件和目录路径名的抽象表示形式
 * java把电脑中的文件和文件夹封装成了一个file类 我们可以使用file类对文件和文件夹进行操作
 * 我们可以使用file类的方法
 * <p>
 * 创建一个文件/文件夹
 * 删除文件/文件夹
 * 获取文件/文件夹
 * 判断文件/文件夹是否存在
 * 对文件夹进行遍历
 * 获取文件的大小
 * file类是一个与系统无关的类 任何的操作系统都可以使用这个类中的方法
 */
public class Demo01File {
    public static void main(String[] args) {


        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);  //路径分隔符 windows ;分号 linux ：冒号

        String separator = File.separator;
        System.out.println(separator);  //文件名称分隔符 windows \    linux /


    }
}
