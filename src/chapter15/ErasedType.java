package chapter15;

import java.util.ArrayList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:42 2020/6/2
 */
public class ErasedType {
    public static void main(String[] args) {
        Class<? extends ArrayList> aClass = new ArrayList<Integer>().getClass();
        System.out.println(aClass);
    }
}
