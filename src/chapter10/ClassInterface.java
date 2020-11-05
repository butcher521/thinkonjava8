package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:12 2020/5/25
 */
public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface{

        @Override
        public void howdy() {
            System.out.println("howdy");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
