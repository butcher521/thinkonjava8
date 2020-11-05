package chapter08;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:49 2020/5/24
 */
public class PrivateOverride {
    private void f(){
        System.out.println("基类的私有");
    }

    public static void main(String[] args) {
        Derived s=new Derived();

    }
}
class Derived extends PrivateOverride{
    private void f(){
        System.out.println("子类的私有");
    }
}
