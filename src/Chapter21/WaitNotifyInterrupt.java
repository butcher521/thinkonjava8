package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:34 2020/6/5
 */
public class WaitNotifyInterrupt {
    static Object object=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    try {
                        System.out.println("开始");
                        object.wait();
                        System.out.println("结束");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println("中断前");
        thread.interrupt();/*中断异常，该线程终止*/
        System.out.println("中断后");
    }
}
