package demo6.pattern.bridge;

/**
 * @author ：_my
 * @date ：Created in 2021/8/31 20:36
 * @description： windows  扩展抽象化角色
 * @modified By：`
 * @version: 1.0
 */
public class Windows extends OpratingSystem {


    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
