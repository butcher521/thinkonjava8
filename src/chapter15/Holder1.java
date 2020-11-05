package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:22 2020/5/30
 */
class Automobile {
}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    public Automobile get() {
        return a;
    }
}
