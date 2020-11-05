package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:38 2020/6/1
 */
public class CountObject {
    private static long counter;
    private final long id=counter++;
    public long id(){
        return id;
    }
    public String toString(){
        return "countObject"+id;
    }

    public static void main(String[] args) {
        Generator<CountObject> gen = BasicGenerator.creat(CountObject.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(gen.next());
        }
    }
}
