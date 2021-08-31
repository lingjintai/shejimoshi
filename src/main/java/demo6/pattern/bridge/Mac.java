package demo6.pattern.bridge;

/**
 * @author ：_my
 * @date ：Created in 2021/8/31 20:37
 * @description：
 * @modified By：`
 * @version: 1.0
 */
public class Mac extends OpratingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
       videoFile.decode(fileName);
    }
}
