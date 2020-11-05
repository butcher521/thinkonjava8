package chapter22;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 17:12 2020/6/8
 */
public class ThreadNotSafe {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class Safe{
    private int value;

    public  synchronized int getValue() {
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }

}
class SafeToo{
    private volatile int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
