package chapter15;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:11 2020/6/1
 */
public class Generators {
    private static <T> Collection<T> fill(Collection<T> collection,Generator<T> gen,int n){
        for (int i = 0; i < n; i++) {
            collection.add(gen.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        Collection<Integer> list = fill(new ArrayList<Integer>(), new Fibonacci(), 30);
        System.out.println(list);
    }
}
