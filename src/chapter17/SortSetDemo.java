package chapter17;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:29 2020/6/3
 */
public class SortSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        Collections.addAll(set,1,2,3,6,3,5,7,3);
        System.out.println(set);
        SortedSet<Integer> head = set.headSet(5);
        System.out.println(head);

    }
}
