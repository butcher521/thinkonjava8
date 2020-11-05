package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 20:32 2020/5/25
 */
abstract class Base{
    public Base(int i){
        System.out.println("base构造器"+i);
    }
    public abstract  void f();
}
public class AnonymousConstruction {
    public static Base getBase(int i){
        return new Base(i) {
            @Override
            public void f() {
                System.out.println("内部类的f方法");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
