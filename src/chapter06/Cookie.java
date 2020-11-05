package chapter06;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 13:50 2020/5/23
 */
public class Cookie {
    public Cookie(){
        System.out.println("cookie construction");
    }
     protected void bite(){
        System.out.println("父类bite");
    }
}
class Cool extends Cookie{
    public Cool(){
        System.out.println("cool construction");
    }
    public void ite(){
        bite();
    }

    public static void main(String[] args) {
        Cool cool = new Cool();
        cool.ite();
    }
}
