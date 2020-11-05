package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:07 2020/6/6
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()){
                    System.out.println(Thread.currentThread()+"hello");
                }
            }
        });
        thread.start();
        Thread.sleep(1);
        System.out.println("主线程中断子线程");
        thread.interrupt();
        thread.join();
        thread.interrupt();
        System.out.println("主线程完事");
    }
}
