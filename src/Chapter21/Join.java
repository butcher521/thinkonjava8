package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:50 2020/7/17
 */
public class Join {
    public static void main(String[] args) {
        Thread a=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("马上阻塞");
                for (;;){}

            }
        });
        Thread main = Thread.currentThread();
        Thread b=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                main.interrupt();
            }
        });
        a.start();
        b.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
