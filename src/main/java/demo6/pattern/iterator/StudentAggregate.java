package demo6.pattern.iterator;

/**
 * @author ：_my
 * @date ：Created in 2021/11/15 21:03
 * @description： 抽象聚合角色接口
 * @modified By：`
 * @version: 1.0
 */
public interface StudentAggregate {

    //添加学生功能
    void addStudent(Student student);

    //删除学生功能
    void removeStudent(Student student);

    //获取迭代器对象的功能
    StudentIterator getStudentIterator();

}
