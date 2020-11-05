package chapter17;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:46 2020/6/2
 */
class Government implements Generator<String> {
    String[] foundation = "nwhdun wijdiw owjdiw jwiij wjdj".split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDateTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionDate<String>(new Government(), 5));
        set.addAll(CollectionDate.list(new Government(), 5));
        System.out.println(set);
    }
}
