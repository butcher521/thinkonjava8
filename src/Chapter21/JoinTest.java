package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 8:37 2020/6/6
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("a线程完事了");
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("b线程完事");
            }
        });
        threadA.start();
        threadB.start();
        System.out.println("等待子线程完事");
        threadA.join();
        threadB.join();
        System.out.println("锁头线程都完了！");
    }
}
