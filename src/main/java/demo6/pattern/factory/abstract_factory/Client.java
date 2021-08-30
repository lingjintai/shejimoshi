package demo6.pattern.factory.abstract_factory;

import java.util.StringJoiner;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/12 0012 16:11
 */
public class Client {

    public static void main(String[] args) {
        //创建意大利和甜品长对象

        ItalyDessertFactory italyDessertFactory =new ItalyDessertFactory();

        Coffee coffee = italyDessertFactory.createCoffee();
        Dessert dessert = italyDessertFactory.createDessert();

        System.out.println(coffee.getName());
        dessert.show();

        StringJoiner sj =new StringJoiner(",","[","]");



        System.out.println(sj.toString());        sj.add("我的").add("幸福").add("生活");




    }
}
