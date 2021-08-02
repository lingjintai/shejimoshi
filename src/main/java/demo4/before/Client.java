package demo4.before;

/**
 * @description:
 * @author: ljt
 * @time: 2021/7/30 0030 16:59
 */
public class Client {

    public static void main(String[] args) {

        HeiMaSafetyDoor door = new HeiMaSafetyDoor();

        door.antiTheft();
        door.fireProof();
        door.waterProof();


    }
}
