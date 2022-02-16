package demo;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: ljt
 * @time: 2021/12/23 0023 16:51
 */
public class MyDelayedTask implements Delayed {





    @Override
    public long getDelay(TimeUnit unit) {


        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }


}
