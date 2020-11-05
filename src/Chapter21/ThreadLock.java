package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:14 2020/6/5
 */
public class ThreadLock {
    private static volatile Object resourceA=new Object();
    private static volatile Object resourceB=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println("线程a获取资源a的监视器锁");
                    synchronized (resourceB){
                        System.out.println("线程a获取资源b的监视器锁");

                        System.out.println("线程a释放资源a的锁");
                        try {
                            resourceA.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);/*先休眠，让线程a现获取所有的共享资源！*/
                    synchronized (resourceA){
                        System.out.println("线程b获取资源a的锁");
                        System.out.println("线程b尝试获取资源b的锁");
                        synchronized (resourceB){
                            System.out.println("线程b获取资源b的锁");
                            System.out.println("线程b丢弃资源a的锁");
                            resourceA.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();
        System.out.println("主线程结束！");
    }

}
