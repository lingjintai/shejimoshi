package demo6.pattern.state.after.java.demo6.pattern.iterator;

import java.util.List;

/**
 * @author ：_my
 * @date ：Created in 2021/11/15 20:08
 * @description： 具体迭代器
 * @modified By：`
 * @version: 1.0
 */
public class StudentIteratorImpl implements StudentIterator {


    private List<Student> list;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    private int position = 0;//用来记录遍历时的位置

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student student = list.get(position);
        position++;
        return student;
    }
}
