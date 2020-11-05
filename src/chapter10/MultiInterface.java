package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 21:35 2020/5/25
 */
interface A{}
interface B{}
class X implements A,B{}
class Y implements A{
    B makeB(){
        return new B() {
        };
    }
}
public class MultiInterface {
    static  void takeA(A a){}
    static void  takeB(B b){}

    public static void main(String[] args) {
        X x=new X();
        Y y=new Y();
        takeA(x);
        takeB(x);
        takeA(y);
        takeB(y.makeB());
    }
}
