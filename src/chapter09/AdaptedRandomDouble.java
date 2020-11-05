package chapter09;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:13 2020/5/25
 */
public class AdaptedRandomDouble extends RandomDouble implements Readable {
    private int count;

    public AdaptedRandomDouble(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next());
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDouble(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble());
        }
    }

}

