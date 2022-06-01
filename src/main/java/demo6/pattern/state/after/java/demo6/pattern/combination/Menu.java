package demo6.pattern.state.after.java.demo6.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 菜单类 属于树枝节点
 * @author: ljt
 * @time: 2021/9/9 0009 15:07
 */
public class Menu extends MenuComponent {

    //菜单可以有多个子菜单项
    private List<MenuComponent> list = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return list.get(index);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        //打印菜单名称
        System.out.println(name);
        //打印子菜单或者子菜单项
        list.forEach(x -> {
            x.print();
        });
    }
}
