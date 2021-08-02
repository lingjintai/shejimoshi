package demo4.after;

/**
 * @description:
 * @author: ljt
 * @time: 2021/8/2 0002 14:34
 */
public class Client {

    public static void main(String[] args) {
        HeiMaSafetyDoor heiMaSafetyDoor =new HeiMaSafetyDoor();
         heiMaSafetyDoor.antiTheft();
         heiMaSafetyDoor.fireproof();
         heiMaSafetyDoor.waterproof();


        PanpanDoor panpanDoor =new PanpanDoor();
        panpanDoor.antiTheft();
        panpanDoor.fireproof();

    }
}
