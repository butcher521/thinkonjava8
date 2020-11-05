package chapter06;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:04 2020/5/23
 */
public class StaticObject {
    public static void main(String[] args) {
Soup2.getInstance().f();
        Soup1 instance = Soup1.getInstance();
    }
}

class Soup1 {
    private Soup1() {

    }

    public static Soup1 getInstance() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }

    private static Soup2 soup2 = new Soup2();

    public static Soup2 getInstance() {
        return soup2;
    }
    public void f(){
        System.out.println("f");
    }
}
