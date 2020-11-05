package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:25 2020/6/6
 */
public class SleepInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    System.out.println("子线程睡眠");
                    Thread.sleep(200000);
                    System.out.println("子线程苏醒");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        /*确保子线程先执行*/
        Thread.sleep(1000);
        thread.interrupt();/*主线程调用子线程的中断；*/
        thread.join();
        System.out.println("主线程完毕");
    }
}
