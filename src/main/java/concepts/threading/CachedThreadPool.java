package concepts.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by pradeep on 16/7/17.
 */
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        LiftOff liftOff = new LiftOff();
        for (int i = 0; i < 5; i++) {
            exec.execute(liftOff);
//            exec.shutdown();
        }
    }
}
