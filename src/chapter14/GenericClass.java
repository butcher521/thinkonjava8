package chapter14;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 9:37 2020/5/30
 */
public class GenericClass {
    public static void main(String[] args) {
        Class<Integer> integerClass = int.class;
        Class intClass = int.class;
        integerClass=Integer.class;
        intClass=double.class;
        intClass=Double.class;
        Class<? extends Number> aClass = int.class;
        aClass=double.class;

    }
}
