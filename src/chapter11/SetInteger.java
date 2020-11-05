package chapter11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:56 2020/5/28
 */
public class SetInteger {
    public static void main(String[] args) {
        Set<Integer> list=new HashSet<>();
        Random random=new Random();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(30)+1);
        }
        System.out.println(list);
    }
}
