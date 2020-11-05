package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:32 2020/5/30
 */
public class Holder3<T> {
    private T t;

    public Holder3(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Holder3<Automobile> automobileHolder3 = new Holder3<>(new Automobile());
        Automobile t = automobileHolder3.getT();

    }
}
