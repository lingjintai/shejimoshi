package demo6.pattern.state.after.java.demo6.pattern.prototype.test1;

import java.io.Serializable;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/16 0016 13:58
 */
public class Student implements Serializable {

    //学生姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
