package Chapter21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:56 2020/7/17
 */
public class Sleep {
    private static final Lock lock=new ReentrantLock();

    public static void main(String[] args) {
        Thread a=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();/*获取重入锁*/
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();/*必须在finally语句中释放锁！*/
                }
            }
        });
    }
}
