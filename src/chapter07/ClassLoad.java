package chapter07;

import javax.swing.*;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 22:31 2020/5/23
 */
public class ClassLoad {
}
class Insect{
    private int i=9;
    protected int j;
    Insect(){
        System.out.println("i"+i+"j"+j);
        j=39;
    }
    private static int x1=println("static insect.x1 初始化");
    static int println(String s){
        System.out.println(s);
        return 47;
    }
}
class Beet extends Insect{
    private int k=println("beet.k 初始化");
    Beet(){
        System.out.println("k"+k);
        System.out.println(j+"j");
    }
    private static int x2=println("static beet.x2 初始化");

    public static void main(String[] args) {
        System.out.println("beet构造器");
        Beet beet = new Beet();
    }
}