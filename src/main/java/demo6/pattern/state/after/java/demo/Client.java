package demo6.pattern.state.after.java.demo;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: ljt
 * @time: 2021/7/22 0022 15:56
 */
public class Client {


    //这里是得到得到111111111111111111111112222222大萨达大多12大青   蛙多无大dasdsa大群二无群      asdasdadasdas二221111
    //这里是第二次11112222223333
    public static void main(String[] args) {


//        SougouInput sougouInput =new SougouInput();
//        sougouInput.setSkin(new HeiMaSkin());
//
//        sougouInput.display();
//
//
//        User use= new User("张三","admin");
//
//
//        JSONArray jsonArray =new JSONArray();
//
//
//        jsonArray.add(JSONObject.toJSON(use));
//
//        JSONObject jsonObject =new JSONObject();
//        jsonObject.put("parkingSpaceStatusList",jsonArray);
//
//        JSONObject MotorVehicleObject = new JSONObject();
//
//        MotorVehicleObject.put("MotorVehicleObject",jsonObject);
//
//        System.out.println(MotorVehicleObject.toJSONString());

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("3");


        List<String> list1 = new ArrayList<>();
        list1.add("5");
        list1.add("2");

        list.removeAll(list1);

        System.out.println(list);


        Map<String, String> map = null;

        map = Optional.ofNullable(map).orElseGet(() -> {
            return new HashMap<String, String>();
        });

        System.out.println(map);

        map.put("1111", "2222");

        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry next = (Map.Entry) iterator.next();

            System.out.println(next.getKey());
            System.out.println(next.getValue());


            ExecutorService executorService = Executors.newFixedThreadPool(3);


        }


        System.out.println(22>>2);


    }
}
