package Chapter21;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:22 2020/6/6
 */
public class Print {
    public static void main(String[] args) {
        Thread threadA=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("a");
                }
            }
        });
        Thread threadB=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("b");
                }
            }
        });

        threadB.start();
        threadA.start();
    }
}
