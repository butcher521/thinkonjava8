package Chapter21;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:38 2020/7/19
 */
public class Wait {
    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {
                }
            }
        });
        one.setDaemon(true);
        one.start();
        System.out.println("mainthreadisover");

    }
}
