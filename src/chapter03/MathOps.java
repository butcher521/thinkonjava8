package chapter03;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:14 2020/5/22
 */
public class MathOps {
    public static void main(String[] args) {
        Random random=new Random(47);
        /*1到100*/
        double j = Math.random()*100+1;
        for (int index1 = 0; index1 < 10; index1++) {
            System.out.println(Math.round(Math.random()*100+1) );
        }


    }
}
