package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:49 2020/6/5
 */
public class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println("线程1");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        threadTest.start();
        threadTest.start();

    }
}
