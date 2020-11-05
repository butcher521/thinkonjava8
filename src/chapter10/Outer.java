package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:35 2020/5/26
 */
public class Outer {
    private int i=0;
    class Inner{

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        int i = outer.i;
    }
}
