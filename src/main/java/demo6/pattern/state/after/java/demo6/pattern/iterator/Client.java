package demo6.pattern.state.after.java.demo6.pattern.iterator;

import java.util.LinkedList;

/**
 * @author ：_my
 * @date ：Created in 2021/11/15 21:10
 * @description： 迭代器模式
 * @modified By：`
 * @version: 1.0
 */
public class Client {

    public static void main(String[] args) {
//        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
//
//        //添加元素
//        studentAggregate.addStudent(new Student("张三", "12"));
//        studentAggregate.addStudent(new Student("李四", "12"));
//        studentAggregate.addStudent(new Student("王五", "12"));
//
//        //获取迭代去对象
//        StudentIterator studentIterator = studentAggregate.getStudentIterator();
//
//        //开始遍历
//        while (studentIterator.hasNext()){
//            Student next = studentIterator.next();
//            System.out.println(next);
//        }


        LinkedList linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove("2");



    }
}
