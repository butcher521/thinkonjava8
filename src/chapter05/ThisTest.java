package chapter05;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:13 2020/5/23
 */
public class ThisTest {
    private int i;
    public ThisTest get(){
        i++;
        return this;
    }
    void print(){
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest();
        thisTest.get().get().get().print();
    }
}
