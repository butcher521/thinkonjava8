package chapter17;

import java.util.Iterator;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:00 2020/6/3
 */
public class MapDateTest implements Generator<Pair<Integer,String>>,Iterable<Integer> {
private int size=9;
private int num=1;
private char letter='a';

    @Override
    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(num++,""+letter++);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return num<size;
            }

            @Override
            public Integer next() {
                return num++;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
