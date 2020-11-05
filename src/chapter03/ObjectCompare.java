package chapter03;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:29 2020/5/22
 */
public class ObjectCompare {
    public static void main(String[] args) {
        Integer i1=new Integer(22);
        Integer i2=new Integer(22);
        System.out.println(i1==i2);/*false*/
        System.out.println(i1.equals(i2));/*true*/
        Value v1=new Value();
        Value v2=new Value();
        v1.i=v2.i=100;
        System.out.println(v1.equals(v2));/*false*/
    }
}
class Value{
    int i;
}
