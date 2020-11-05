package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:28 2020/7/17
 */
public class Interrupt {
    static Object object=new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread a=new Thread(()->{
            synchronized (object){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hheee");
            }

        });
        a.start();
        Thread.sleep(1000);

    }
}
