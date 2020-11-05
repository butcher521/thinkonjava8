package Chapter21;

import java.util.Currency;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:48 2020/6/6
 */
public class Iner {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.interrupted());

                System.out.println("获取当前的中断标志！"+Thread.currentThread().isInterrupted());
            }
        });
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("主线程结束");
    }
}
