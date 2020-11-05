package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:08 2020/6/5
 */
public class NotifyTest {
    private static volatile Object resourceA=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println("线程a获取资源锁");
                    try {
                        System.out.println("线程a挂起之前");
                        resourceA.wait();
                        System.out.println("线程a挂起之后");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println("线程b获取资源锁");
                    try {
                        System.out.println("线程b挂起之前");
                        resourceA.wait();
                        System.out.println("线程b挂起之后");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadC=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resourceA){
                    System.out.println("线程c唤醒收资源挂起的线程");
                    resourceA.notifyAll();
                }
            }
        });
        threadA.start();
        threadB.start();
        Thread.sleep(1000);
        threadC.start();

        threadA.join();
        threadB.join();
        threadC.join();
        System.out.println("主线程结束");

    }
}
