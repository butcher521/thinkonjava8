package chapter08;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 15:30 2020/5/24
 */
public class Transmogrify {
    private Actor actor=new Happy();
    void change(){
        actor=new Sad();
    }
    void perform(){
        actor.act();
    }

    public static void main(String[] args) {
        Transmogrify t=new Transmogrify();
        t.perform();
        t.change();
        t.perform();
    }
}
class Actor{
    void act(){

    }
}
class Happy extends Actor{
    void act(){
        System.out.println("happy");
    }
}
class Sad extends  Actor{
    void act(){
        System.out.println("sad");
    }
}
