package Chapter21;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;
import org.omg.IOP.TAG_JAVA_CODEBASE;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:12 2020/6/6
 */
public class SleepTest {
    private static final Lock lock=new ReentrantLock();

    public static void main(String[] args) {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();/*获取锁*/

                try {
                    System.out.println("线程a睡眠");
                    Thread.sleep(1000);
                    System.out.println("线程a苏醒了");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();

                try {
                    System.out.println("b线程睡眠");
                    Thread.sleep(1000);
                    System.out.println("b线程醒来");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
