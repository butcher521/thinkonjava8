package chapter08;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 16:12 2020/5/24
 */
public class DownCast {
    public static void main(String[] args) {
        Useful[] s={new Useful(),new MoreUserFul()};
        s[0].f();
        s[1].g();
        ((MoreUserFul)s[1]).v();
        if(s[0] instanceof MoreUserFul){
            ((MoreUserFul)s[0]).v();
        }

        MoreUserFul m=new MoreUserFul();
        m.v();

    }
}
class Useful{
    void f(){

    }
    void g(){

    }
}
class MoreUserFul extends Useful{
    @Override
    void f() {
        super.f();
    }

    @Override
    void g() {
        super.g();
    }
    void v(){

    }

}
