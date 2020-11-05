package chapter09;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:08 2020/5/25
 */
public class RandomDouble {
    private static Random random=new Random(47);
    public double next(){
        return random.nextDouble();
    }

    public static void main(String[] args) {
        RandomDouble randomDouble = new RandomDouble();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomDouble.next());
        }
    }
}
