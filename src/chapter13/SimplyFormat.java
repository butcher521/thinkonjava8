package chapter13;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:05 2020/5/29
 */
public class SimplyFormat {
    public static void main(String[] args) {
        int x=7;
        double y=1.11;
        System.out.printf("[%d,%f]\n",x,y);
        System.out.println();
        System.out.format("[%d,%f]\n",x,y);
    }
}
