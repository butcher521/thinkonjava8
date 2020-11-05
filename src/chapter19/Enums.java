package chapter19;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:53 2020/6/3
 */
public class Enums {
    private static Random rand = new Random(47);

    public static <T extends Enum<T>> T random(Class<T> type) {
       return random(type.getEnumConstants());
    }

    public static <T> T random(T[] values) {
        return values[rand.nextInt(values.length)];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(random(TT.class));
        }
    }
}
