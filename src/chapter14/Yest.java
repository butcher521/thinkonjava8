package chapter14;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:52 2020/5/30
 */
interface A{
    void a();
}
class B implements A{
    @Override
    public void a() {

    }
    public void b(){

    }
}
public class Yest {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.getClass());
        a.a();

        if(a instanceof B){
            B b=(B)a;
            b.b();
        }
    }
}
