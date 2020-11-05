package chapter13;

import java.util.Random;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 14:31 2020/5/29
 */
public class Using {
    public static Random random=new Random();
    public String toString(){
        StringBuilder r = new StringBuilder("[");
        for (int i = 0; i < 10; i++) {
            r.append(random.nextInt(55));
            r.append(",");
        }
        r.delete(r.length()-1,r.length());
        r.append("]");
        return r.toString();
    }

    public static void main(String[] args) {
        Using using = new Using();
        System.out.println(using);
    }
}
