package demo6.pattern.prototype.test;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/16 0016 10:30
 */
public class CitationTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        //浅克隆
        //        Citation citation = new Citation();
//        citation.setName("张三");
//        citation.show();
//        Citation clone = citation.clone();
//        clone.setName("王五");
//        clone.show();


        Citation citation = new Citation();

        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        Citation clone = citation.clone();
        clone.getStudent().setName("李四");

        citation.show();
        clone.show();
    }
}
