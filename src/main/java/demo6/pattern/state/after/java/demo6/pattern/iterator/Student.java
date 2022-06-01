package demo6.pattern.state.after.java.demo6.pattern.iterator;

/**
 * @author ：_my
 * @date ：Created in 2021/11/15 20:02
 * @description：
 * @modified By：`
 * @version: 1.0
 */

public class Student {

    private String name;

    private String num;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
