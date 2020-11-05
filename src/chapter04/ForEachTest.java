package chapter04;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 22:11 2020/5/22
 */
public class ForEachTest {
    public static void main(String[] args) {
      /*  Double[] d=new Double[10];
        Random random=new Random(47);
        for (int i = 0; i < 10; i++) {
            d[i]=random.nextDouble()*100+1;
        }
        for (Double aDouble : d) {
            System.out.println(aDouble);
        }*/
      for (char s:"mqjdiweofoow".toCharArray()){
          System.out.println(s);
      }
    }
}
