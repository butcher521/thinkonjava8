package chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:44 2020/5/29
 */
public class Recursion {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        List<Recursion> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Recursion());
        }
        System.out.println(list);
    }

}
