package demo6.pattern.state.after.java.demo6.pattern.bridge;

/**
 * @author ：_my
 * @date ：Created in 2021/8/31 20:28
 * @description： avi视频文件  具体的实现化角色
 * @modified By：`
 * @version: 1.0
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件="+fileName);
    }
}
