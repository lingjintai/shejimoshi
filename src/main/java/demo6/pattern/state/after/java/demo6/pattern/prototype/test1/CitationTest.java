package demo6.pattern.state.after.java.demo6.pattern.prototype.test1;

import java.io.*;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/16 0016 10:30
 */
public class CitationTest {

    public static void main(String[] args) throws Exception {

        Citation citation = new Citation();

        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:/ceishi/b.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:/ceishi/b.txt"));
        Citation clone = (Citation) ois.readObject();
        ois.close();
        clone.getStudent().setName("李四");

        File file = new File("G:\\ceishi\\b.txt");
        if (file.exists()) {
            file.delete();
        }
        citation.show();
        clone.show();
    }
}
