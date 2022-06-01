package demo6.pattern.state.after.java.demo6.pattern.singleton.demo9;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/11 0011 9:34
 */
public class test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("dsadas");
        aaa<Person> aaa = new aaa<Person>();
        List<Person> list = new ArrayList<Person>();
        list.add(person);
        aaa.setAa(list);

        System.out.println(aaa.getAa().get(0).getName());


        String aaa1 = aaa(list);

        System.out.println(aaa1);

    }



    public static <T> String aaa(List<T> aaa){

        return "dasda";
    }

}
