package Chapter21;

import jdk.nashorn.internal.ir.CallNode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:03 2020/6/5
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exes = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exes.execute(new LiftOff());
        }
        exes.shutdown();
    }
}
