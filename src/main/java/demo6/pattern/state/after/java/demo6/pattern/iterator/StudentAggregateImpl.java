package demo6.pattern.state.after.java.demo6.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：_my
 * @date ：Created in 2021/11/15 21:07
 * @description：
 * @modified By：`
 * @version: 1.0
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();


    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }


    //获取迭代器对象
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
