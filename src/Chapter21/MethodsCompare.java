package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:34 2020/6/6
 */
public class MethodsCompare {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){}
            }
        });
        thread.start();
        thread.interrupt();/*设置中断标志为true*/

        System.out.println("获取当前的中断标志"+thread.isInterrupted());
        System.out.println("获取中断状态，并且重置！"+Thread.interrupted());
        System.out.println("获取中断状态，并且重置！"+Thread.interrupted());
        System.out.println("获取中断状态"+thread.isInterrupted());

        thread.join();
        System.out.println("主线程完成");


    }
}
