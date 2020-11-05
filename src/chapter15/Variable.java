package chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:03 2020/6/1
 */
public class Variable {
    public static <T> List<T> creat(T...args){
        List<T> list = new ArrayList<>();
        for (T ele : args) {
            list.add(ele);
        }
        return list;
    }

    public static void main(String[] args) {
        List<List<Integer>> creat = creat(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(creat);
    }
}
