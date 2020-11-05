package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:56 2020/5/30
 */
class Ship{}
class Car{}
public class TupleTest {
    static TwoTuple<String,Integer> f(){
        return new TwoTuple<String, Integer>("你好",22);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> f = f();

        System.out.println(f.second);
    }
}
