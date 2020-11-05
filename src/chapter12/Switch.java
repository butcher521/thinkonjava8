package chapter12;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 11:03 2020/5/29
 */
public class Switch {
    private boolean state=false;
    public boolean read(){
        return state;
    }
    public void on(){
        state=true;
        System.out.println(this);
    }
    public void off(){
        state=false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state? "on":"off";
    }
}
class Exception1 extends Exception{}
class Exception2 extends Exception{}
class OnOff{
    private static Switch aSwitch=new Switch();
    public static void f()throws Exception1,Exception2 {

    }

    public static void main(String[] args) {
        try {
            aSwitch.on();
            f();
        }catch (Exception1 e){
            System.out.println(e);

        }catch (Exception2 e){
            System.out.println(e);
        }finally {
            aSwitch.off();
        }
    }
}
