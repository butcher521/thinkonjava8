package chapter15;

import java.util.Iterator;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:04 2020/6/1
 */
public class FibIterator extends Fibonacci implements Iterable<Integer> {
    private int n;

    public FibIterator(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return FibIterator.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer integer : new FibIterator(5)) {
            System.out.println(integer);
        }
    }
}
