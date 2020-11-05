package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:53 2020/5/26
 */
class WithInner{
    class Inner{

    }
}
public class InheritInner extends WithInner.Inner {
    InheritInner(WithInner wi){/*阐述以外部类对象的引用；*/
        wi.super();/*以利用外部类作为构造器*/
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);
    }
}
