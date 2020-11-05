package chapter05;

/**
 * @Author MPC
 * @Description:
 * @Date Created in 10:27 2020/5/23
 */
public class Flower {
    private String name;
    private int age;
    public Flower(String name){
        this.name=name;
    }
    public Flower(int age){
        this.age=age;
    }
    public Flower(String name,int age){
        this(name);
        this.age=age;
    }
}
