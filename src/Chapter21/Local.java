package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:24 2020/6/6
 */
public class Local {
    public static void print(String s){
        System.out.println(s+":"+localVariable.get());
        /*localVariable.remove();*/
    }
    static ThreadLocal<String> localVariable=new ThreadLocal<>();

    public static void main(String[] args) {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("线程a的局部变量");
                print("线程a");
                System.out.println("线程a remove以后"+localVariable.get());
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                localVariable.set("线程b的局部变量");
                print("线程b");
                System.out.println("线程b remove以后"+localVariable.get());
            }
        });
        threadA.start();
        threadB.start();

    }
}
