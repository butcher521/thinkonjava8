package chapter15;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:39 2020/5/30
 */
public class TwoTuple<A,B> {
   public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "("+first+","+second+")";
    }
}
class ThreeTuple<A,B,C> extends TwoTuple<A,B>{
    public final C third;
    public ThreeTuple(A first, B second,C third) {
        super(first, second);
        this.third=third;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
