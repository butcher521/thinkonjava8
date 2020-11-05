package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:17 2020/6/1
 */
public class GenericMethod {
    public static <T> void f(T t){
        System.out.println(t.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        f(1);
        f(1L);
        f('a');
        f("");
        f(new GenericMethod());
    }
}
