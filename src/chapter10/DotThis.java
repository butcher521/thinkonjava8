package chapter10;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:59 2020/5/25
 */
public class DotThis {
    void f(){
        System.out.println("外部类的方法");
    }
    public class Inner{
        private int i=1;
        public DotThis getDotThis(){
            return DotThis.this;      /* new DotThis();*/
        }

    }
    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis ss = new DotThis();
        int i = ss.new Inner().i;
        System.out.println(i);
        Inner inner =new DotThis().getInner();
        inner.getDotThis().f();
        DotThis dotThis = new DotThis();
        Inner inner1 = dotThis.new Inner();


    }
}

