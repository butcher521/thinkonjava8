package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:11 2020/7/13
 */
public class Demo4 {
    public static <T> void forEach(List<T> list, Consumer<T> c){
        for (T t : list) {
            c.accept(t);
        }
    }

    public static void main(String[] args) {
        forEach(Arrays.asList(1,2,3,4),(Integer i)-> System.out.println(i));
    }
}
