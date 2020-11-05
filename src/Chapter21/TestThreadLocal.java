package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:53 2020/6/7
 */
public class TestThreadLocal {
    private static ThreadLocal<String> map=new InheritableThreadLocal<>();

    public static void main(String[] args) {
        map.set("你好");
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(map.get()+"子线程变量");
            }
        });
        thread.start();
        System.out.println(map.get()+"主线程变量");
    }
}
