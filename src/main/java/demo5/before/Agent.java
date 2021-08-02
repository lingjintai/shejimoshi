package demo5.before;

/**
 * @description:经济人类
 * @author: ljt
 * @time: 2021/8/2 0002 15:13
 */
public class Agent {


    private Star star;

    private Fans fans;

    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见了一面");
    }

    //和媒体公司洽谈的方法
    public void business() {
        System.out.println(star.getName() + "和媒体公司" + company.getName() + "洽谈了工作");
    }


}
