package lambda;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:17 2020/7/13
 */
public class Demo5 {
    public static <T,R>List<R> map(List<T> list, Function<T,R> function){
        final ArrayList<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        final List<Integer> reslut = map(Arrays.asList("aade", "wqdwqdhu", "edwqd"), String::length);
        System.out.println(reslut);
    }
}
