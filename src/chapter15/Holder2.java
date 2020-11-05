package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:25 2020/5/30
 */
public class Holder2 {
    private Object obj;

    public Holder2(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile a=(Automobile)holder2.getObj();
    }
}
