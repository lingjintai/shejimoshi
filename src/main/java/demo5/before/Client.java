package demo5.before;

/**
 * @description:测试类
 * @author: ljt
 * @time: 2021/8/2 0002 15:30
 */
public class Client {
    public static void main(String[] args) {
        //创建经济人类
        Agent agent =new Agent();

        //创建明星对象
        Star star =new Star("张三");
        //创建粉丝对象
        Fans fans =new Fans("李四");
        //创建媒体公司类
        Company company =new Company("超威公司");

        agent.setStar(star);
        agent.setCompany(company);
        agent.setFans(fans);
        agent.meeting();
        agent.business();


    }
}
