package chapter04;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 22:33 2020/5/22
 */
public class SwitchTest {
    public static void main(String[] args) {
        Random random=new Random(47);
        for (int i = 0; i < 100; i++) {
            int n = random.nextInt(26) + 'a';
            System.out.print( (char) n);
            switch ((char)n){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("元音");
                    break;
                case 'w':
                case 'y':
                    System.out.println("有的时候为元音");
                    break;
                default:
                    System.out.println("为辅音");
            }

        }
    }
}
