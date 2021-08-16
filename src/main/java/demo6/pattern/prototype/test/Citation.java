package demo6.pattern.prototype.test;

/**
 * @description: 奖状类
 * @author: ljt
 * @time: 2021/8/16 0016 10:26
 */
public class Citation implements Cloneable {

    //获奖人员名字
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public  void  show (){
        System.out.println(student.getName()+"获得了奖状");
    }

}
