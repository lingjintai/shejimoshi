package demo6.pattern.state.after.java.demo6.pattern.singleton.demo9;


import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/9 0009 11:15
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        //调用Runtime 的方法
        Process ipconfig = runtime.exec("ipconfig");

        InputStream inputStream = ipconfig.getInputStream();
        byte[]  arr =new byte[1024*1024*100];
        int read = inputStream.read(arr);

        System.out.println(new String(arr,0,read,"GBK"));



    }

}
