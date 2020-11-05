package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:30 2020/6/5
 */
public class LiftOff implements Runnable {
    protected int countDown=10;
    private  static  int taskCount=0;
    private final int id=taskCount++;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        countDown = countDown;
    }
public String status(){
        return id +"("+(countDown>0?countDown:"liftOff")+")";
}
    @Override
    public void run() {
        while (countDown-->0){
            System.out.println(status());
            Thread.yield();
        }

    }

    public static void main(String[] args) {
       /* LiftOff liftOff = new LiftOff();
        liftOff.run();  *//*单独的调用run方法，这并不具备什么线程能力；*/
        Thread thread = new Thread(new LiftOff());

        thread.start();
        System.out.println("主线程！");

    }
}

