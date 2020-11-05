package chapter04;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:57 2020/5/22
 */
public class WhileTest {
    public static boolean condition(){
        double random = Math.random();
        boolean result = random < 0.99;
        System.out.println(random);
        return result;
    }

    public static void main(String[] args) {
        while (condition()){
            System.out.println("while");
        }
    }
}
