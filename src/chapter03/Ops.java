package chapter03;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:36 2020/5/22
 */
public class Ops {
    static int op(int i) {
        return i < 10 ? i * 10 : i * 5;
    }

    public static void main(String[] args) {
        System.out.println(op(4));
    }
}
