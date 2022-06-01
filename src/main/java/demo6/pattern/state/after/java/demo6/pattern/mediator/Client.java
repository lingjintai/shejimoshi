package demo6.pattern.state.after.java.demo6.pattern.mediator;

/**
 * @description:
 * @author: ljt
 * @time: 2021/10/22 0022 15:43
 */
public class Client {


    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediator = new MediatorStructure();
        //创建租房者对象
        Tenant tenant = new Tenant("张三", mediator);
        //创建房主
        HouseOwner houseOwner = new HouseOwner("李四", mediator);

        //中介者要知道具体的房主和租房者
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        tenant.constact("我要租一套房子你有么");
        houseOwner.constact("我这里有房子 我可以租给你");



    }
}
