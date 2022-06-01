package file.demo01;

import java.io.File;

/**
 * 路径：
 * 绝对路径：是一个完整的路径
 * 是以盘符开始的路径    D:\javaWork\shejimoshi
 * <p>
 * 相对路径：是一个简化的路径
 * 相对指的是 相对于当前项目的跟目录
 * 如果使用当前项目的根目录 路径可以简化写
 * <p>
 * 注意
 * 1 路径是不分大小写
 * 2  路径中的文件名称分隔符windows使用反斜杠 反斜杠是转义字符 两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {
    public static void main(String[] args) {
        show01();
        show02("D:","a.txt");
   }

    /**
     * 通过指定的路径名字符串转化为抽象路径来创建一个file实例
     * File(String pathname)
     * 参数 String pathname 字符串路径名称
     * 路径可以是文件结尾 也可以是文件夹结尾
     * 路径可以是相对路径 也可以是绝对路径
     * 创建file对象 只是把字符串路径封装为 file对象 不考虑路径的真是情况
     */
    private static void show01() {
        File file1 = new File("D:\\javaWork\\shejimoshi\\a.txt");
        System.out.println(file1); //重写了toString方法 打印的是路径


        File file2 = new File("D:\\javaWork\\shejimoshi");
        System.out.println(file2); //重写了toString方法 打印的是路径

        File file3 = new File("a.txt");
        System.out.println(file3); //重写了toString方法 打印的是路径
    }


    /**
     * File(String parent, String child)
     * 参数 把路径分成了两部分
     * String parent 父路径
     * String child 子路径
     * 好处是 父路径和子路径 可以单独书写  使用起来非常灵活   父路径和子路径都可以变化
     */
    private static void show02(String parent, String child) {
        File file1 = new File(parent, child);
        System.out.println(file1);


    }


}
