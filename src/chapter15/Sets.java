package chapter15;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:21 2020/6/2
 */
public class Sets {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        Set<T> ts = new HashSet<>(a);
        ts.addAll(b);
        return ts;
    }

    public static <T> Set<T> interSection(Set<T> a, Set<T> b) {
        Set<T> ts = new HashSet<>(a);
        ts.retainAll(b);
        return ts;
    }

    public static <T> Set<T> difference(Set<T> a, Set<T> b) {
        Set<T> ts = new HashSet<>(a);
        ts.removeAll(b);
        return ts;
    }
    public static <T>Set<T> complement(Set<T>a,Set<T> b){
       return difference(union(a,b),interSection(a,b));
    }

}
