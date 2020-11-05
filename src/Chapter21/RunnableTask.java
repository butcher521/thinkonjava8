package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:52 2020/6/5
 */
public class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("我是一个子线程");
    }

    public static void main(String[] args) {
        new Thread(new RunnableTask()).start();/*多个线程执行一份任务，在一份源代码中就可以实现*/
       new Thread(()-> System.out.println("这是另外一个线程")).start();
    }
}
