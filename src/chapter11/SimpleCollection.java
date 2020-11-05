package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:36 2020/5/28
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        for (Integer integer : collection) {
            System.out.println(integer);
        }

    }
}
