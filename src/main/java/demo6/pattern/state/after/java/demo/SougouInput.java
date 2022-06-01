package demo6.pattern.state.after.java.demo;

/**
 * @description:  搜狗输入法
 * @author: ljt
 * @time: 2021/7/22 0022 15:54
 */
public class SougouInput {

    private AbstractSkin skin;
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void  display(){
        skin.display();
    }


}
