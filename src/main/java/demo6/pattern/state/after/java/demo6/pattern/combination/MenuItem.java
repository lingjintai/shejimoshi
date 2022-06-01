package demo6.pattern.state.after.java.demo6.pattern.combination;

/**
 * @description: 菜单项类 属于叶子节点
 * @author: ljt
 * @time: 2021/9/9 0009 15:25
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name ,int level) {
        this.name=name;
        this.level=level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(name);
    }
}
