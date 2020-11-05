package chapter19;

import chapter17.Generator;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:43 2020/6/3
 */
enum  TT implements Generator<TT> {
   ONE,TWO,THREE ;
private Random random=new Random(6);

    @Override
    public TT next() {
        return values()[random.nextInt(values().length)];
    }
}
public class EnumIpl {
    public static <T> void printNext(Generator<T> gen){
        System.out.println(gen.next());
    }

    public static void main(String[] args) {
        TT ele=TT.ONE;
        for (int i = 0; i < 10; i++) {
            printNext(ele);
        }
    }
}
