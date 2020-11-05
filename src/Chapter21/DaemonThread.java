package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:06 2020/6/6
 */
public class DaemonThread {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){}
            }
        });
        thread.setDaemon(true);
        thread.start();
        System.out.println("主线程结束");
    }
}
