package chapter11;

import chapter02.StaticTest;

import java.util.ArrayList;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:08 2020/5/28
 */
class Apple{
    private  static long counter;
    private final long  id=counter++;
    public long getId(){
        return id;
    }

}
class Orange{

}
public class WithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples=new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            apples.add(new Orange());
        }
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).getId();
        }
    }
}
