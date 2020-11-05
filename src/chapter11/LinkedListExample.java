package chapter11;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:43 2020/5/28
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(list);
        list.getFirst();
        list.element();
        list.peek();
    }
}
