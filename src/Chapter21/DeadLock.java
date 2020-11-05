package Chapter21;

import sun.awt.windows.ThemeReader;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:26 2020/6/6
 */
public class DeadLock {
    private static Object resourceA=new Object();
    private static Object resourceB=new Object();

    public static void main(String[] args) {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println(Thread.currentThread()+"获取了资源a");
                  /*  try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    System.out.println(Thread.currentThread()+"等待获取资源b");
                    synchronized (resourceB){
                        System.out.println(Thread.currentThread()+"获取了资源b");
                    }
                }

            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println(Thread.currentThread()+"获取资源a");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread()+"等待获取资源b");
                    synchronized (resourceB){
                        System.out.println(Thread.currentThread()+"获取资源b");
                    }
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
