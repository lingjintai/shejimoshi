package demo6.pattern.bridge;

/**
 * @author ：_my
 * @date ：Created in 2021/8/31 20:31
 * @description： 抽象的操作系统类 抽象化角色
 * @modified By：`
 * @version: 1.0
 */
public abstract class OpratingSystem {

    //声明videoFile
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
