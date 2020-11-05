package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 19:36 2020/7/12
 */
public class Demo3 {
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
Predicate<String> noEmpty=(String s)->s.isEmpty();
        final ArrayList<String> strings = new ArrayList<>();
        final List<String> result = filter(strings, noEmpty);

    }
}
