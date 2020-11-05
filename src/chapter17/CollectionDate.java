package chapter17;

import java.util.ArrayList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:39 2020/6/2
 */
public class CollectionDate<T> extends ArrayList<T> {
    public CollectionDate(Generator<T> gen,int quantity){
        for (int i = 0; i < quantity; i++) {
            add(gen.next());
        }
    }
    public static <T> CollectionDate<T> list(Generator<T> gen,int quantity){
        return new CollectionDate( gen,quantity);
    }
}
