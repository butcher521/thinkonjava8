package chapter15;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:57 2020/6/1
 */
/*public class Coffee {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "   " + id;
    }
}

interface Generator<T> {
    T next() throws IllegalAccessException, InstantiationException;
}

class A1 extends Coffee {
}

class A2 extends Coffee {
}

class A3 extends Coffee {
}

class A4 extends Coffee {
}

class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] array = {A1.class, A2.class, A3.class, A4.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }
    private int size=0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee next() throws IllegalAccessException, InstantiationException {

            return (Coffee) array[random.nextInt(array.length)].newInstance();

    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            int count=size;
            @Override
            public boolean hasNext() {
                return count>0;
            }

            @Override
            public Coffee next() {
                count--;
                try {
                    return CoffeeGenerator.this.next();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        CoffeeGenerator gen = new CoffeeGenerator();
        for (int i = 0; i < 4; i++) {
            System.out.println(gen.next());
        }
    }
}*/
