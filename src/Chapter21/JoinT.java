package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 8:46 2020/6/6
 */
public class JoinT {
    public static void main(String[] args) {
        Thread one=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程1启动");
                for (;;){}

            }
        });
        Thread main = Thread.currentThread();
        Thread two=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                main.interrupt();
            }
        });
        one.start();
        two.start();
        try {
            one.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
