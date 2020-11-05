package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:03 2020/7/11
 */
public class Demo2 {
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result=new ArrayList<T>();
        for (T e : list) {
            if (predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Predicate<String> noEmpty=(String s)->!s.isEmpty();
        final ArrayList<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList("1","2",""));
        final List<String> noEmptyList = filter(strings, noEmpty);
        System.out.println(noEmptyList);
    }
}
