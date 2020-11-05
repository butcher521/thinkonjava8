package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:50 2020/5/29
 */
public class Runtime {
    static void f(){
        throw new RuntimeException();

    }

    public static void main(String[] args) {
        f();
    }
}
